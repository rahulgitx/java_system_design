package parkinglotUdemy.ticket;

import lombok.Getter;
import lombok.Setter;
import parkinglotUdemy.parkingspot.ParkingSpot;
import parkinglotUdemy.vehicle.Vehicle;

import java.time.Instant;

@Setter
@Getter
public class Ticket {
    private String ticketId;
    private ParkingSpot parkingSpot;
    private Vehicle vehicle;
    private Instant checkInTime;
    private Instant checkoutTime;
}
