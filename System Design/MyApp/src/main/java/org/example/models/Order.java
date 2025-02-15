package org.example.models;

public class Order extends Item{
    String orderId;
    String constumerName;
    String itemId;
    float cost;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getConstumerName() {
        return constumerName;
    }

    public void setConstumerName(String constumerName) {
        this.constumerName = constumerName;
    }

    @Override
    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }
}
