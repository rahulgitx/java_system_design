package CarRentalSystem;

import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;

@Getter
@Setter
public class CarRentalSystem {
    private HashMap<String,Store> stores;
    private HashMap<String, User> users;
}
