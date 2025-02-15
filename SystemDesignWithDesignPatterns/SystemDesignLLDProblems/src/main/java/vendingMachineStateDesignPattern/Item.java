package vendingMachineStateDesignPattern;

import lombok.Getter;
import lombok.Setter;
import vendingMachineStateDesignPattern.enums.ItemType;

@Setter
@Getter
public class Item {
    private ItemType itemType;
    private int itemCode;
    private int cost;
}
