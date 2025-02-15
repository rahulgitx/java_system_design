package atm.cashWithDrawalProcessors;

import atm.Atm;
import atm.enums.MoneyType;

import java.util.HashMap;

public class TwoThousandCashProcessor extends CashWithDrawalProcessor{
    public TwoThousandCashProcessor(CashWithDrawalProcessor cashWithDrawalProcessor){
        super(cashWithDrawalProcessor);
    }

    @Override
    public void process(Atm atm, Integer amountLeft, HashMap<MoneyType, Integer> moneyCollected) {
        int countInAtm = atm.getMoneyInAtm().getOrDefault(MoneyType.TwoThousandNote, 0);
        if(countInAtm > 0 && amountLeft >= MoneyType.TwoThousandNote.value){
            int countRequired = amountLeft/MoneyType.TwoThousandNote.value;
            atm.getMoneyInAtm().put(MoneyType.TwoThousandNote, countInAtm-countRequired);
            moneyCollected.put(MoneyType.TwoThousandNote, countRequired);
            amountLeft -= countRequired*MoneyType.TwoThousandNote.value;
        }

        if(this.getNextCashWithDrawalProcessor() != null) {
            this.getNextCashWithDrawalProcessor().process(atm, amountLeft, moneyCollected);
        }
    }

}
