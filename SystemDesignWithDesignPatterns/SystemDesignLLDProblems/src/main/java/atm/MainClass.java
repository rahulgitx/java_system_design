package atm;

import atm.enums.MoneyType;
import atm.enums.TransactionType;
import atm.states.IdleState;
import java.util.*;


public class MainClass {
    public static void main(String[] args) {
        Atm atm = createAtm();
        User user = createUser();

        atm.getAtmState().insertCard(user.getAtmCard(), atm);
        atm.getAtmState().authenticateCard("9898", atm);
        atm.getAtmState().showTransactionsOptions();
        atm.getAtmState().chooseTransaction(TransactionType.Money_Withdrawal, atm);
        HashMap<MoneyType, Integer> res = atm.getAtmState().cashWithDrawal(3400,atm);
        for(Map.Entry<MoneyType, Integer> entry : res.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
    public static User createUser(){
        User user = new User();
        BankAccount bankAccount = new BankAccount();
        bankAccount.setBalance(13423);
        user.setUserId("1");
        user.setBankAccount(bankAccount);
        AtmCard card = new AtmCard();
        card.setBankAccount(bankAccount);
        card.setUserId("1");
        card.setCvv("233");
        card.setPin("9898");

        user.setAtmCard(card);
        return user;
    }

    public static Atm createAtm(){
        Atm atm = new Atm();
        atm.setAtmState(new IdleState());
        HashMap<MoneyType, Integer> mp = new HashMap<>();
        mp.put(MoneyType.TwoThousandNote, 22);
        mp.put(MoneyType.FiveHundredNote, 23);
        mp.put(MoneyType.HundredNote, 2222);
        atm.setMoneyInAtm(mp);
        return atm;
    }

}
