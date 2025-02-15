package vendingMachineStateDesignPattern.state.impl;

import vendingMachineStateDesignPattern.Item;
import vendingMachineStateDesignPattern.VendingMachine;
import vendingMachineStateDesignPattern.enums.Coin;
import vendingMachineStateDesignPattern.state.MachineState;

import java.util.List;

public class IdleState implements MachineState {
    IdleState(){
        System.out.println("Currently Machine is in Idle state");
    }

    @Override
    public void clickToInsertCoin(VendingMachine vendingMachine) throws Exception {
        vendingMachine.setState(new InsertCoinState());
    }

    @Override
    public void clickToEnterItemCode(VendingMachine vendingMachine) throws Exception {
        throw new Exception("Cannot perform this operation in idle state");
    }

    @Override
    public void insertCoins(VendingMachine vendingMachine, List<Coin> coins) throws Exception {
        throw new Exception("Cannot perform this operation in idle state");
    }

    @Override
    public void enterItemCode(VendingMachine vendingMachine, List<Integer> codes) throws Exception {
        throw new Exception("Cannot enter item code in idle state");
    }

    @Override
    public Item dispenseItem(VendingMachine vendingMachine) throws Exception {
        throw new Exception("Cannot enter item code in idle state");
    }

    @Override
    public int returnChange(VendingMachine vendingMachine) throws Exception {
        throw new Exception("Cannot enter item code in idle state");
    }

    @Override
    public List<Coin> refundFullMoney(VendingMachine vendingMachine) throws Exception {
        throw new Exception("Cannot enter item code in idle state");
    }
}
