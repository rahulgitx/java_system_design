package atm.states;

import atm.Atm;
import atm.AtmCard;
import atm.cashWithDrawalProcessors.CashWithDrawalProcessor;
import atm.cashWithDrawalProcessors.FiveHundredCashProcessor;
import atm.cashWithDrawalProcessors.HundredCashProcessor;
import atm.cashWithDrawalProcessors.TwoThousandCashProcessor;
import atm.enums.MoneyType;
import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
@Getter
@Setter
public class CashWithDrawalState extends AtmState{
    private HashMap<MoneyType, Integer> moneyCollected;
    private CashWithDrawalProcessor cashWithDrawalProcessor;
    public CashWithDrawalState(){
        System.out.println("In cash withdrawal state");
    }

    public HashMap<MoneyType, Integer> cashWithDrawal(Integer withDrawAmount, Atm atm){
        if(withDrawAmount > atm.getCardAttached().getBankAccount().getBalance()){
            System.out.println("Not enought Balance in your account!");
            return null;
        }

        if(withDrawAmount%MoneyType.HundredNote.value != 0){
            System.out.println("Please enter an amount which is multiple of : " + MoneyType.HundredNote.value);
        }

        moneyCollected = new HashMap<>();
        cashWithDrawalProcessor = new TwoThousandCashProcessor(new FiveHundredCashProcessor(new HundredCashProcessor(null)));

        cashWithDrawalProcessor.process(atm, withDrawAmount, moneyCollected);

        return moneyCollected;
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
