package org.example.models;

public class RequestOrderBody {
    String customerName;
    String middleManName;
    Item item;

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getMiddleManName() {
        return middleManName;
    }

    public void setMiddleManName(String middleManName) {
        this.middleManName = middleManName;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }
}
