package parkinglotUdemy.manager;

import parkinglotUdemy.parkingspot.ParkingSpot;
import parkinglotUdemy.vehicle.Vehicle;

import java.util.List;

public abstract class ParkingSpotManager {
    private List<ParkingSpot> parkingSpotList;

    public ParkingSpotManager(List<ParkingSpot> parkingSpotList){
        this.parkingSpotList = parkingSpotList;
    }

    public void findParkingSpot(){

    }
    public void addParkingSpot(ParkingSpot newParkingSpot){
        parkingSpotList.add(newParkingSpot);
    }
    public void removeParkingSpot(ParkingSpot parkingSpot){
        parkingSpotList.remove(parkingSpot);
    }

    void parkVehicle(Vehicle vehicle){

    }
    void removeVehicle(Vehicle vehicle){

    }
}
