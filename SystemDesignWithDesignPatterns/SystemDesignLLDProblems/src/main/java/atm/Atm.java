package atm;

import atm.enums.MoneyType;
import atm.states.AtmState;
import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;

@Getter
@Setter
public class Atm {
    private String atmId;
    private AtmState atmState;
    private AtmCard cardAttached;
    private HashMap<MoneyType, Integer> moneyInAtm;
}
