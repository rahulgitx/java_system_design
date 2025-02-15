package atm;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AtmCard {
    private String cardNo;
    private String userId;
    private String cvv;
    private String pin;
    private BankAccount bankAccount;
}
