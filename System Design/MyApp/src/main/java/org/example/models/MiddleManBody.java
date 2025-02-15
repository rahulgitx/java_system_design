package org.example.models;

import java.time.Instant;

public class MiddleManBody {
    String orderId;
    Instant timestamp;
    String consumerName;
    Item item;
    float cost;

    public MiddleManBody(String orderId, Instant timestamp, String consumerName, Item item, float cost) {
        this.orderId = orderId;
        this.timestamp = timestamp;
        this.consumerName = consumerName;
        this.item = item;
        this.cost = cost;
    }
}
