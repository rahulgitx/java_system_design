package CarRentalSystem.vehicle;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Car extends Vehicle{
    public Car(int hourlyPrice){
        super(hourlyPrice);
    }
}
