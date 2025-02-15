package org.repository.models;

import org.repository.models.parkingSpot.ParkingSpot;
import org.repository.models.parkingSpot.ParkingType;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Map;

public class ExitTerminal extends Terminal{
    public ExitTerminal(String id){
        super(id);
    }

    public Ticket exitFromParkingLotAndGetCharges(Ticket ticket){
        String parkingSpotId = ticket.getParkingSpotId();
        vacateParkingSpot(parkingSpotId);
        Float charges = calculateParkingCharges(ticket.getIssueTime(), ticket.getParkingType());
        ticket.setValid(false);
        ticket.setCharges(charges);
        return ticket;
    }

    private void vacateParkingSpot(String parkingSpotId){
        ParkingLot parkingLot = ParkingLot.getInstance();
        for(Map.Entry<String, Floor> entry : parkingLot.getFloors().entrySet()){
            entry.getValue().vacateParkingSpot(parkingSpotId);
        }
    }
    private Float calculateParkingCharges(LocalDateTime issueTime, ParkingType parkingType){
        float perHourCharge = getPerHourCharge(parkingType);
        LocalDateTime currentTime = LocalDateTime.now();
        LocalDateTime truncatedIssueTime = issueTime.truncatedTo(ChronoUnit.HOURS);
        LocalDateTime truncatedCurrentTime = currentTime.truncatedTo(ChronoUnit.HOURS);

        // Calculate the difference in hours
        long hoursDifference = ChronoUnit.HOURS.between(truncatedIssueTime, truncatedCurrentTime);

        return hoursDifference*perHourCharge;

    }
    private float getPerHourCharge(ParkingType parkingType){
        switch (parkingType){
            case ParkingType.CAR : return 50;
            case ParkingType.EBIKE: return 20;
            case ParkingType.ECAR: return 40;
            case ParkingType.LARGEVEHICLE: return 100;
            case ParkingType.BIKE: return 30;
            case ParkingType.DIFFERENTLY_ABLED: return 5;
        }
        return 0;
    }
}
