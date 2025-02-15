package atm.states;

import atm.Atm;
import atm.AtmCard;
import atm.enums.MoneyType;
import atm.enums.TransactionType;
import lombok.Getter;
import lombok.Setter;

import java.util.*;

@Getter
@Setter
public abstract class AtmState {
    public void insertCard(AtmCard card, Atm atm){
        throw new RuntimeException("Error performing this function");
    }
    public void authenticateCard(String pin, Atm atm){
        throw new RuntimeException("Error performing this function");
    }
    public void showTransactionsOptions(){
        throw new RuntimeException("Error performing this function");
    }
    public void chooseTransaction(TransactionType transactionType, Atm atm){
        throw new RuntimeException("Error performing this function");
    }
    public void checkBalance(Atm atm){
        throw new RuntimeException("Error performing this function");
    }
    public void exit(Atm atm){
        throw new RuntimeException("Error performing this function");
    }
    public AtmCard collectCard(Atm atm){
        throw new RuntimeException("Error performing this function");
    }
    public HashMap<MoneyType, Integer> cashWithDrawal(Integer withDrawAmount, Atm atm){
        throw new RuntimeException("Error performing this function");
    }
}
