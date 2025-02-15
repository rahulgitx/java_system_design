package org.example.repository;

import org.example.models.Item;
import org.example.models.Order;

public class JpaRepository{
    public Item getItemEntry(int id){
        // connect with database and gives back the entry
    }
    public boolean updateItemEntry(Item item){
        // update the entry
    }
    public void placeOrder(Order order){
        // insert query in the database
    }

    public void updateItem(Item item){
        // updates item
    }
}
