package bookMyShow;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class Screen {
    private int screenNo;
    private List<Seat> seats;
}
