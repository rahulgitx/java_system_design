package vendingMachineStateDesignPattern;
import lombok.Getter;
import lombok.Setter;

import java.util.*;
@Setter
@Getter
public class Inventory {
    private List<Shelf> shelves;
    public boolean isItemPresent(int code){
        for(Shelf shelf : shelves){
            if(shelf.getItems().getOrDefault(code, 0) > 0) return true;
        }
        return false;
    }
    public Item getItem(int code, VendingMachine vendingMachine){
        Item item = vendingMachine.itemCodes.get(code);
        for(Shelf shelf : shelves){
            if(shelf.getItems().containsKey(code)){
                shelf.getItems().put(item, shelf.getItems().getOrDefault(item, 0)-1);
            }
        }
        return item;
    }
}
