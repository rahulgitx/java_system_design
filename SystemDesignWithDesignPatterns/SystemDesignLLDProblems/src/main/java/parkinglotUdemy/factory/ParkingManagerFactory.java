package parkinglotUdemy.factory;

import parkinglotUdemy.constants.VehicleType;
import parkinglotUdemy.manager.FourWheelerParkingSpotManager;
import parkinglotUdemy.manager.LargeVehicleParkingSpotManager;
import parkinglotUdemy.manager.ParkingSpotManager;
import parkinglotUdemy.manager.TwoWheelerParkingSpotManager;
import parkinglotUdemy.parkingspot.LargeWheelerParkingSpot;
import parkinglotUdemy.vehicle.Vehicle;

import java.util.ArrayList;

public class ParkingManagerFactory {
    public ParkingSpotManager getParkingSpotManager(Vehicle vehicle){
        if(vehicle.getVehicleType()== VehicleType.FOURWHEELER){
            return new FourWheelerParkingSpotManager(new ArrayList<>());
        }
        else if(vehicle.getVehicleType()==VehicleType.TWOWHEELER){
            return new TwoWheelerParkingSpotManager(new ArrayList<>());
        }
        else if(vehicle.getVehicleType()==VehicleType.LARGEVEHICLE){
            return new LargeVehicleParkingSpotManager(new ArrayList<>());
        }
        else{
            return null;
        }
    }
}
