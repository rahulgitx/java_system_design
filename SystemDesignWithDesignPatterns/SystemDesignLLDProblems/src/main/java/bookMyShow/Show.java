package bookMyShow;

import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Setter
@Getter
public class Show {
    private String id;
    private Movie movie;
    private Instant time;
    private Screen screen;
    private int price;
}
