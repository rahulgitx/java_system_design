package CarRentalSystem;

import CarRentalSystem.vehicle.Car;
import CarRentalSystem.vehicle.Vehicle;
import CarRentalSystem.vehicle.VehicleType;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class Store {
    private String location;
    private String storeId;
    private VehicleInventory carVehicleInventory;
    private VehicleInventory bikeVehicleInventory;
    public Reservation makeReservation(User user, Vehicle vehicle, int duration){
        Reservation reservation = new Reservation(user, vehicle, duration, this);
        if(vehicle.getVehicleType().equals(VehicleType.Car)){
            carVehicleInventory.changeVehicleStatus(vehicle.getVechicleId());
        }
        else if(vehicle.getVehicleType().equals(VehicleType.Bike)){
            bikeVehicleInventory.changeVehicleStatus(vehicle.getVechicleId());
        }
        return reservation;
    }
    public Bill completeReservation(Reservation reservation){
        reservation.setBookDuration(4);
        reservation.setBill(new Bill(reservation.getVehicle(), reservation.getBookDuration()));
        return reservation.getBill();
    }
    public List<Vehicle> showVehicles(VehicleType vehicleType){
        List<Vehicle> list = null;
        switch (vehicleType){
            case Car :
                list = carVehicleInventory.getVehicleList();
            case Bike:
                list = bikeVehicleInventory.getVehicleList();
        }
        return list;
    }

//    public
}
