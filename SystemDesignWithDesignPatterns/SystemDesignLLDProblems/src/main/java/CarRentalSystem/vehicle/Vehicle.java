package CarRentalSystem.vehicle;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Vehicle {
    private int vechicleId;
    private VehicleType vehicleType;
    private boolean isAvailable;
    private Float carPrice;
    private int hourlyPrice;
    public Vehicle(int hourlyPrice){
        this.hourlyPrice = hourlyPrice;
    }
    public float getSecurityMoney(){
        return carPrice * 0.2f;
    }
}
