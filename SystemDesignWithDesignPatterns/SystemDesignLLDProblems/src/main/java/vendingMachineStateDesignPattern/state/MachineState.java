package vendingMachineStateDesignPattern.state;

import vendingMachineStateDesignPattern.Item;
import vendingMachineStateDesignPattern.VendingMachine;
import vendingMachineStateDesignPattern.enums.Coin;
import java.util.*;
public interface MachineState {
    public void clickToInsertCoin(VendingMachine vendingMachine) throws Exception;
    public void clickToEnterItemCode(VendingMachine vendingMachine) throws Exception;
    public void insertCoins(VendingMachine vendingMachine, List<Coin> coins) throws Exception;
    public void enterItemCode(VendingMachine vendingMachine, List<Integer> codes) throws Exception;
    public Item dispenseItem(VendingMachine vendingMachine) throws Exception;
    public int returnChange(VendingMachine vendingMachine) throws Exception;
    public List<Coin> refundFullMoney(VendingMachine vendingMachine) throws Exception;
}
