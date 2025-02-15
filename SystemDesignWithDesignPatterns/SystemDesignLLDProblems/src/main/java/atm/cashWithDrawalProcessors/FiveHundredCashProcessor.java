package atm.cashWithDrawalProcessors;

import atm.Atm;
import atm.enums.MoneyType;

import java.util.HashMap;

public class FiveHundredCashProcessor extends CashWithDrawalProcessor{
    public FiveHundredCashProcessor(CashWithDrawalProcessor cashWithDrawalProcessor){
        super(cashWithDrawalProcessor);
    }
    @Override
    public void process(Atm atm, Integer amountLeft, HashMap<MoneyType, Integer> moneyCollected) {
        int countInAtm = atm.getMoneyInAtm().getOrDefault(MoneyType.FiveHundredNote, 0);
        if(countInAtm > 0 && amountLeft >= MoneyType.FiveHundredNote.value){
            int countRequired = amountLeft/MoneyType.FiveHundredNote.value;
            atm.getMoneyInAtm().put(MoneyType.FiveHundredNote, countInAtm-countRequired);
            moneyCollected.put(MoneyType.FiveHundredNote, countRequired);
            amountLeft -= countRequired*MoneyType.FiveHundredNote.value;
        }

        if(this.getNextCashWithDrawalProcessor() != null) {
            this.getNextCashWithDrawalProcessor().process(atm, amountLeft, moneyCollected);
        }
    }
}
