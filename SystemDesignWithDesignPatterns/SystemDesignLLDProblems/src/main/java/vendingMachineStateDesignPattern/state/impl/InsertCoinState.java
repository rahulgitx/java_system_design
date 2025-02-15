package vendingMachineStateDesignPattern.state.impl;

import vendingMachineStateDesignPattern.Item;
import vendingMachineStateDesignPattern.VendingMachine;
import vendingMachineStateDesignPattern.enums.Coin;
import vendingMachineStateDesignPattern.state.MachineState;

import java.util.List;

public class InsertCoinState implements MachineState {

    @Override
    public void clickToInsertCoin(VendingMachine vendingMachine) throws Exception {
        return;
    }

    @Override
    public void clickToEnterItemCode(VendingMachine vendingMachine) throws Exception {
        vendingMachine.setState(new ChooseItemState());
    }

    @Override
    public void insertCoins(VendingMachine vendingMachine, List<Coin> coins) throws Exception {
        vendingMachine.setCoinsList(coins);
    }

    @Override
    public void enterItemCode(VendingMachine vendingMachine, List<Integer> codes) throws Exception {
        throw new Exception("Cannot perform this operation in insert coin state");
    }

    @Override
    public Item dispenseItem(VendingMachine vendingMachine) throws Exception {
        throw new Exception("Cannot perform this operation in insert coin state");
    }

    @Override
    public int returnChange(VendingMachine vendingMachine) throws Exception {
        throw new Exception("Cannot perform this operation in insert coin state");
    }

    @Override
    public List<Coin> refundFullMoney(VendingMachine vendingMachine) throws Exception {
        throw new Exception("Cannot perform this operation in insert coin state");
    }
}
