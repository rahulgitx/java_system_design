package org.repository.models.vehicle;

public abstract class Vehicle {
    private String vehicleId;
    private VehicleType vehicleType;

    public String getVehicleId() {
        return vehicleId;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    Vehicle(String id, VehicleType vehicleType){
        this.vehicleId= id;
        this.vehicleType = vehicleType;
    }
}
