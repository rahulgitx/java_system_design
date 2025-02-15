package org.repository.models;

import org.repository.models.parkingSpot.ParkingSpot;
import org.repository.models.parkingSpot.ParkingType;
import org.repository.models.vehicle.VehicleType;

import java.util.Comparator;
import java.util.HashMap;
import java.util.PriorityQueue;

import static java.util.Objects.isNull;
import static org.repository.models.vehicle.VehicleType.*;

public class Floor {
    private String floorId;

    private HashMap<ParkingType, PriorityQueue<ParkingSpot>> availableSpots = new HashMap<>();
    private HashMap<String, ParkingSpot> occupiedSpots = new HashMap<>();

    // constructor
    public Floor(String id){
        this.floorId = id;
        Comparator<ParkingSpot> comp = new Comparator<ParkingSpot>() {
            @Override
            public int compare(ParkingSpot o1, ParkingSpot o2) {
                return o1.getId().compareTo(o2.getId());
            }
        };
        for(ParkingType parkingType : ParkingType.values()){
            availableSpots.put(parkingType, new PriorityQueue<>(comp));
        }
    }

    public void addParkingSpot(ParkingSpot parkingSpot){
        PriorityQueue<ParkingSpot> pq = availableSpots.get(parkingSpot.getParkingType());
        pq.add(parkingSpot);
//        availableSpots.put(parkingSpot.getParkingType(), pq);
    }
    public boolean isSpotAvailable(VehicleType vehicleType){
        ParkingType parkingType = getParkingSpotType(vehicleType);
        return !availableSpots.get(parkingType).isEmpty();
    }

    public ParkingSpot fillParkingSpot(VehicleType vehicleType){
        ParkingType parkingType = getParkingSpotType(vehicleType);
        ParkingSpot parkingSpot = availableSpots.get(parkingType).poll();
        occupiedSpots.put(parkingSpot.getId(), parkingSpot);
        return parkingSpot;
    }

    public void vacateParkingSpot(String parkingSpotId){
        if(occupiedSpots.containsKey(parkingSpotId)){
            ParkingSpot parkingSpot = occupiedSpots.get(parkingSpotId);
            occupiedSpots.remove(parkingSpotId);
            availableSpots.get(parkingSpot.getParkingType()).add(parkingSpot);
        };
    }

    ParkingType getParkingSpotType(VehicleType vehicleType){
        if(vehicleType == CAR) return ParkingType.CAR;
        if(vehicleType == TRUCK || vehicleType == BUS) return ParkingType.LARGEVEHICLE;
        if(vehicleType == BIKE) return ParkingType.BIKE;
        if(vehicleType == EBIKE) return ParkingType.EBIKE;
        if(vehicleType == ECAR) return ParkingType.ECAR;
        if(vehicleType == WHEELCHAR) return ParkingType.DIFFERENTLY_ABLED;
        return ParkingType.CAR;
    }


    public String getFloorId() {
        return floorId;
    }

    public void setFloorId(String floorId) {
        this.floorId = floorId;
    }
}
