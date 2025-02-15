package org.repository.models.parkingSpot;

import org.repository.models.ParkingLot;

public abstract class ParkingSpot {
    private String id;

    private ParkingType parkingType;
    public ParkingSpot(String id, ParkingType type){
        this.id = id;
        this.parkingType = type;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ParkingType getParkingType() {
        return parkingType;
    }

    public void setParkingType(ParkingType parkingType) {
        this.parkingType = parkingType;
    }

}
