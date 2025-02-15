package bookMyShow;

import lombok.Getter;
import lombok.Setter;
import java.util.*;
@Setter
@Getter
public class Ticket {
    private Show show;
    private List<Seat> seats;
    private int price;
    private Payment payment;
}
