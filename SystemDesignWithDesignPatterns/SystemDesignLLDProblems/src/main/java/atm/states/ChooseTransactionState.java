package atm.states;

import atm.Atm;
import atm.AtmCard;
import atm.enums.TransactionType;
import atm.factory.TransactionStateFactory;

public class ChooseTransactionState extends AtmState{

    TransactionStateFactory transactionStateFactory = new TransactionStateFactory();
    public ChooseTransactionState(){
        System.out.println("In choose transaction state");
    }
    @Override
    public void showTransactionsOptions(){
        System.out.println("List of available transactions:");
        TransactionType.showAllTransactions();
    }
    @Override
    public void chooseTransaction(TransactionType transactionType, Atm atm){
        atm.setAtmState(transactionStateFactory.createObject(transactionType));
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
