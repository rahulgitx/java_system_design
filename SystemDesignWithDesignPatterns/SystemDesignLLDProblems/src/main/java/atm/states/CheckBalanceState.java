package atm.states;

import atm.Atm;
import atm.AtmCard;

import javax.smartcardio.Card;

public class CheckBalanceState extends AtmState{
    public CheckBalanceState(){
        System.out.println("In check balance state");
    }
    @Override
    public void checkBalance(Atm atm){
        int val = atm.getCardAttached().getBankAccount().getBalance();
        System.out.println("Balance left in the account is : " + val);
    }
    @Override
    public void exit(Atm atm){
        System.out.println("Exiting to main menu");
        atm.setAtmState(new IdleState());
        collectCard(atm);
    }
    @Override
    public AtmCard collectCard(Atm atm){
        AtmCard card = atm.getCardAttached();
        atm.setCardAttached(null);
        return card;
    }
}
