package org.example.services;

import org.example.models.Item;

public interface Service {
    Item getItem(int id);
    boolean placeOrder(Item item, String name, String middleManName);
}
