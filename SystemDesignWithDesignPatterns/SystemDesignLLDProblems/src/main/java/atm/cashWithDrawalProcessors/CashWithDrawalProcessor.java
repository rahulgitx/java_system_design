package atm.cashWithDrawalProcessors;

import atm.Atm;
import atm.enums.MoneyType;
import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;

@Getter
@Setter
public abstract class CashWithDrawalProcessor {
    private CashWithDrawalProcessor nextCashWithDrawalProcessor;
    public CashWithDrawalProcessor(CashWithDrawalProcessor nextCashWithDrawalProcessor){
        this.nextCashWithDrawalProcessor = nextCashWithDrawalProcessor;
    }

    public abstract void process(Atm atm, Integer amountLeft, HashMap<MoneyType, Integer> moneyCollected);

}
