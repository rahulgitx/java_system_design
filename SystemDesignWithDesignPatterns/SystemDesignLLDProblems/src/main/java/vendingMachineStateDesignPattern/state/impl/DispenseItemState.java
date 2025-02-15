package vendingMachineStateDesignPattern.state.impl;

import vendingMachineStateDesignPattern.Item;
import vendingMachineStateDesignPattern.VendingMachine;
import vendingMachineStateDesignPattern.enums.Coin;
import vendingMachineStateDesignPattern.state.MachineState;

import java.util.ArrayList;
import java.util.List;

public class DispenseItemState implements MachineState {

    @Override
    public void clickToInsertCoin(VendingMachine vendingMachine) throws Exception {
        throw new Exception("Cannot perform this action in this state");
    }

    @Override
    public void clickToEnterItemCode(VendingMachine vendingMachine) throws Exception {
        throw new Exception("Cannot perform this action in this state");
    }

    @Override
    public void insertCoins(VendingMachine vendingMachine, List<Coin> coins) throws Exception {
        throw new Exception("Cannot perform this action in this state");
    }

    @Override
    public void enterItemCode(VendingMachine vendingMachine,List<Integer> codes) throws Exception {
        throw new Exception("Cannot perform this action in this state");
    }

    @Override
    public Item dispenseItem(VendingMachine vendingMachine) throws Exception {
        System.out.println(vendingMachine.getItemsToDispense());
        vendingMachine.setItemsToDispense(new ArrayList<>());
        returnChange(vendingMachine);
        vendingMachine.setState(new IdleState());
        return null;
    }

    @Override
    public int returnChange(VendingMachine vendingMachine) throws Exception {
        if(vendingMachine.getCurrentOrderCost() < vendingMachine.getTotalCustomerMoney()){
            System.out.println("returning change");
        }
        return 0;
    }

    @Override
    public List<Coin> refundFullMoney(VendingMachine vendingMachine) throws Exception {
        return null;
    }
}
