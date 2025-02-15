package vendingMachineStateDesignPattern.state.impl;

import vendingMachineStateDesignPattern.Item;
import vendingMachineStateDesignPattern.VendingMachine;
import vendingMachineStateDesignPattern.enums.Coin;
import vendingMachineStateDesignPattern.state.MachineState;

import java.util.ArrayList;
import java.util.List;

public class ChooseItemState implements MachineState {
    ChooseItemState(){
        System.out.println("In choose item state");
    }
    @Override
    public void clickToInsertCoin(VendingMachine vendingMachine) throws Exception {
        throw new Exception("cannot perform this operation in choose item state");
    }

    @Override
    public void clickToEnterItemCode(VendingMachine vendingMachine) throws Exception {
        return;
    }

    @Override
    public void insertCoins(VendingMachine vendingMachine, List<Coin> coins) throws Exception {
        throw new Exception("cannot perform this operation in choose item state");
    }

    @Override
    public void enterItemCode(VendingMachine vendingMachine,List<Integer> codes) throws Exception {
        int itemsPrice = 0;
        List<Item> itemsToDispense = new ArrayList<>();

        for(Integer code : codes){
            if(vendingMachine.getInventory().isItemPresent(code)){
                System.out.println("Item not present");
                System.out.println(refundFullMoney(vendingMachine));
            }
            else{
                itemsPrice += vendingMachine.getItemCodes().get(code).getCost();
                itemsToDispense.add(vendingMachine.getInventory().getItem(code, vendingMachine));
            }
        }

        int money = vendingMachine.getTotalCustomerMoney();
        if(itemsPrice >= money){
            System.out.println("Not sufficient money");
            System.out.println(refundFullMoney(vendingMachine));
        }
        else{
            System.out.println("Wait.. dispensing item");
            vendingMachine.setCurrentOrderCost(itemsPrice);
            vendingMachine.setState(new DispenseItemState());
        }
    }

    @Override
    public Item dispenseItem(VendingMachine vendingMachine) throws Exception {
        return null;
    }

    @Override
    public int returnChange(VendingMachine vendingMachine) throws Exception {
        return 0;
    }

    @Override
    public List<Coin> refundFullMoney(VendingMachine vendingMachine) throws Exception {
        List<Coin> money = vendingMachine.getCoinsList();
        vendingMachine.setCoinsList(new ArrayList<>());
        return money;
    }
}
