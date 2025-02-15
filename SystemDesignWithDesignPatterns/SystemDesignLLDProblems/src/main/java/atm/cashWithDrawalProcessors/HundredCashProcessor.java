package atm.cashWithDrawalProcessors;

import atm.Atm;
import atm.enums.MoneyType;

import java.util.HashMap;

public class HundredCashProcessor extends CashWithDrawalProcessor{
    public HundredCashProcessor(CashWithDrawalProcessor cashWithDrawalProcessor){
        super(cashWithDrawalProcessor);
    }
    @Override
    public void process(Atm atm, Integer amountLeft, HashMap<MoneyType, Integer> moneyCollected) {
        int countInAtm = atm.getMoneyInAtm().getOrDefault(MoneyType.HundredNote, 0);
        if(countInAtm > 0 && amountLeft >= MoneyType.HundredNote.value){
            int countRequired = amountLeft/MoneyType.HundredNote.value;
            atm.getMoneyInAtm().put(MoneyType.HundredNote, countInAtm-countRequired);
            moneyCollected.put(MoneyType.HundredNote, countRequired);
            amountLeft -= countRequired*MoneyType.HundredNote.value;
        }

        if(this.getNextCashWithDrawalProcessor() != null) {
            this.getNextCashWithDrawalProcessor().process(atm, amountLeft, moneyCollected);
        }
    }
}
