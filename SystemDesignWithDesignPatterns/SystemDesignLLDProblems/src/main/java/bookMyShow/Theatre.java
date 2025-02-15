package bookMyShow;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class Theatre {
    private String id;
    private List<Screen> screens;
    private List<Show> shows;
    private String location;
}
