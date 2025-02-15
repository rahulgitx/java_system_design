package bookMyShow;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Payment {
    private boolean paymentDone;
    private String transactionId;
}
