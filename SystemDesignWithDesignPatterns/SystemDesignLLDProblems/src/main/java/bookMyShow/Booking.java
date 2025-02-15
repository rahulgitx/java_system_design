package bookMyShow;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Booking {
    private String id;
    private int price;
    private Ticket ticket;
    private Payment payment;
}
