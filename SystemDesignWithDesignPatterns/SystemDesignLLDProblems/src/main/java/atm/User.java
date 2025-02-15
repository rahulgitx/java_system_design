package atm;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {
    private String userId;
    private BankAccount bankAccount;
    private AtmCard atmCard;
}
