package org.example;


import org.example.models.Item;
import org.example.models.RequestOrderBody;
import org.example.repository.JpaRepository;
import org.example.services.MyService;

import javax.annotation.PostConstruct;

@RestController
public class Controller {


    MyService myService = new MyService();
    @GetMapping
    Item getItem(int id){
        Item item = myService.getItem(id);
        return item;
    }

    @PutMapping
    void placeOrder(@RequestBody RequestOrderBody request){
        Item item = request.getItem();
        String name = request.getCustomerName();
        String middleManName = request.getMiddleManName();
        boolean isPlaced = myService.placeOrder(item, name, middleManName);
        if(isPlaced){
            System.out.println("order placed successfully");
        }
        else{
            System.out.println("unable to place order");
        }
    }
}
