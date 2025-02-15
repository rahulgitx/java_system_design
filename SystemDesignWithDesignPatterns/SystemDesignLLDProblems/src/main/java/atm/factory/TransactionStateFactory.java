package atm.factory;

import atm.enums.TransactionType;
import atm.states.AtmState;
import atm.states.CashWithDrawalState;
import atm.states.CheckBalanceState;

public class TransactionStateFactory {
    private AtmState obj;
    public AtmState createObject(TransactionType transactionType){
        switch (transactionType){
            case Check_Balance:
                obj = new CheckBalanceState();
                break;
            case Money_Withdrawal:
                obj = new CashWithDrawalState();
                break;
        }
        return this.obj;
    }
}
