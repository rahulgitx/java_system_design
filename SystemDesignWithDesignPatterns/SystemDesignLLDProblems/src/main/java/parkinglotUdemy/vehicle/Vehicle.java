package parkinglotUdemy.vehicle;

import lombok.Getter;
import lombok.Setter;
import parkinglotUdemy.constants.VehicleType;

@Setter
@Getter
public class Vehicle {
    private String id;
    private VehicleType vehicleType;
    public Vehicle(VehicleType vehicleType, String id){
        this.vehicleType = vehicleType;
        this.id = id;
    }
}
