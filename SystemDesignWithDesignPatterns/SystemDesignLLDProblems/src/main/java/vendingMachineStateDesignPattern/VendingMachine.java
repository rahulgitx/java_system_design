package vendingMachineStateDesignPattern;

import lombok.Getter;
import lombok.Setter;
import vendingMachineStateDesignPattern.enums.Coin;
import vendingMachineStateDesignPattern.state.MachineState;

import java.util.*;
@Setter
@Getter
public class VendingMachine {
    private Inventory inventory;
    private MachineState state;
    private List<Coin> coinsList;
    private int currentOrderCost=0;
    private List<Item> itemsToDispense;
    HashMap<Integer, Item> itemCodes;

    public int getTotalCustomerMoney(){
        int money = 0;
        for(Coin coin : coinsList){
            money += coin.value;
        }
        return money;
    }
}
