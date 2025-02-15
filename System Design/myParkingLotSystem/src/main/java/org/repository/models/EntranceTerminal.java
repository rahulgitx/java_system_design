package org.repository.models;

import org.repository.models.parkingSpot.ParkingSpot;
import org.repository.models.vehicle.Vehicle;
import org.repository.models.vehicle.VehicleType;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class EntranceTerminal extends Terminal{

    public EntranceTerminal(String id) {
        super(id);
    }

    public boolean isSpotAvailable(Vehicle vehicle){
        VehicleType vehicleType = vehicle.getVehicleType();
        boolean res = false;
        ParkingLot parkingLot = ParkingLot.getInstance();
        for(Map.Entry<String, Floor> entry : parkingLot.getFloors().entrySet()){
            res = res || entry.getValue().isSpotAvailable(vehicleType);
        }
        return res;
    }

    public Ticket issueTicket(Vehicle vehicle){
        ParkingSpot parkingSpot = getParkingSpot(vehicle);
        Ticket ticket = null;
        if(parkingSpot != null)
             ticket = buildTicket(parkingSpot, vehicle);
        return ticket;
    }
    private ParkingSpot getParkingSpot(Vehicle vehicle){
        ParkingLot parkingLot = ParkingLot.getInstance();
        VehicleType vehicleType = vehicle.getVehicleType();
        for(Map.Entry<String, Floor> entry : parkingLot.getFloors().entrySet()){
            if(entry.getValue().isSpotAvailable(vehicleType)){
                 return entry.getValue().fillParkingSpot(vehicleType);
            }
        }
        return null;
    }
    private Ticket buildTicket(ParkingSpot parkingSpot, Vehicle vehicle){
        Ticket ticket = new Ticket();
        ticket.setVehicleType(vehicle.getVehicleType());
        ticket.setParkingType(parkingSpot.getParkingType());
        ticket.setVehicleIdNumber(vehicle.getVehicleId());
        ticket.setParkingSpotId(parkingSpot.getId());
        ticket.setIssueTime(LocalDateTime.now());
        ticket.setTicketId(UUID.randomUUID().toString());
        ticket.setValid(true);
        return ticket;
    }

}
