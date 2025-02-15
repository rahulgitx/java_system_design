package org.example;

import org.example.models.Item;
import org.example.models.ItemAmazon;
import org.example.services.MyService;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        MyService myService = new MyService();
        Item item = myService.getItem(1);
        System.out.println(item);


        ItemAmazon itemAmazon = new ItemAmazon();
//        boolean isPlaced = myService.placeOrder(itemAmazon, "Rahul");
//        System.out.println("Item placed : " + isPlaced);

    }
}