package org.example.services;

import org.example.models.Item;
import org.example.models.MiddleManBody;
import org.example.models.Order;
import org.example.repository.JpaRepository;
import org.example.utils.MiddleManUtils;

import java.time.Instant;
import java.util.HashMap;

import static org.example.utils.MiddleManUtils.middleManHeaders;
import static org.example.utils.MiddleManUtils.middleManUrl;

public class MyService implements Service{

    JpaRepository jpaRepository = new JpaRepository();

    @Override
    public Item getItem(int id) {
        Item item = jpaRepository.getItemEntry(id);
        return item;
    }

    @Override
    public boolean placeOrder(Item item, String customerName, String middleManName) {
        Item item1 = getItem(item.getItemId());
        if(item1.getStockCount()==0) {
            System.out.println("Out of Stock");
            return false;
        }

        Order order = new Order();
        order.setItemId(item1.getItemId());
        order.setName(customerName);
        try{
            jpaRepository.placeOrder(order);
            item1.setStockCount( item1.getStockCount()-1);
            // update item
            updateItem(item);

            // send to amazon flipkart
            updateTheMiddleMan(order, item, middleManName);
        }catch (Exception e){
            System.out.println(e);
            return false;
        }
        return true;
    }

    public void updateItem(Item item){
        jpaRepository.updateItem(item);
    }

    private boolean updateTheMiddleMan(Order order, Item item, String middleManName){
        // make a post call to amazon/flipkart regarding the order made and updated item
        String url = middleManUrl.get(middleManName);
        HashMap<String, String> headers = middleManHeaders.get(middleManName);
        MiddleManBody body = new MiddleManBody(order.getItemId(), Instant.now(), order.getName(), item, order.getCost());
        try{
            Response<String> response = post(url, body, headers, String.class);
        }catch( Exception e){
            System.out.println("Unable to update middleMan: " + e);
            return false;
        }
        return true;
    }
}
