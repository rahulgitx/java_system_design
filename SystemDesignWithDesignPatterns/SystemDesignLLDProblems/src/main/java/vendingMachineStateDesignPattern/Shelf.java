package vendingMachineStateDesignPattern;


import lombok.Getter;
import lombok.Setter;
import java.util.*;
@Setter
@Getter
public class Shelf {
    private int shelfNo;
    private HashMap<Item, Integer> items;
}
