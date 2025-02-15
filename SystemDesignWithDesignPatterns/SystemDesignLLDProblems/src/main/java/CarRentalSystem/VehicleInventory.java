package CarRentalSystem;

import CarRentalSystem.vehicle.Vehicle;
import CarRentalSystem.vehicle.VehicleType;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Vector;

@Setter
@Getter
public class VehicleInventory {
    private List<Vehicle> vehicleList;
    public void changeVehicleStatus(int id){
        for(Vehicle vehicle : vehicleList){
            if(vehicle.getVechicleId() == id){
                vehicle.setAvailable(false);
            }
        }
    }
    public void addVehicle(Vehicle vehicle){
        vehicleList.add(vehicle);
    }
    public void remove(Vehicle vehicle){
        vehicleList.remove(vehicle);
    }

    public List<Vehicle> showVehicles(){
        return vehicleList;
    }

}
