package parkinglotUdemy.parkingspot;

import parkinglotUdemy.vehicle.Vehicle;

public abstract class ParkingSpot {
    private String id;
    private boolean isEmpty = true;
    private Vehicle vehicle;
    private int price;
    public ParkingSpot(String id, int price){
        this.id = id;
        this.price = price;
    }
    public void parkVehicle(Vehicle vehicle){
        isEmpty = false;
        this.vehicle = vehicle;
    }
    public void removeVehicle(Vehicle vehicle){
        this.vehicle = null;
        isEmpty = true;
    }
}
