package bookMyShow;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Seat {
    private int id;
    private SeatType seatType;
    private boolean booked;
}
