package org.repository.models;

import org.repository.models.parkingSpot.ParkingType;
import org.repository.models.vehicle.VehicleType;

import java.time.LocalDateTime;

public class Ticket {
    private String ticketId;

    public String getTicketId() {
        return ticketId;
    }

    public void setTicketId(String ticketId) {
        this.ticketId = ticketId;
    }

    private String parkingSpotId;
    private String vehicleIdNumber;
    private VehicleType vehicleType;
    private ParkingType parkingType;
    private LocalDateTime issueTime;
    private LocalDateTime vacateTime;
    private Float charges;
    private boolean isValid;

    public String getParkingSpotId() {
        return parkingSpotId;
    }

    public void setParkingSpotId(String parkingSpotId) {
        this.parkingSpotId = parkingSpotId;
    }

    public String getVehicleIdNumber() {
        return vehicleIdNumber;
    }

    public void setVehicleIdNumber(String vehicleIdNumber) {
        this.vehicleIdNumber = vehicleIdNumber;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public ParkingType getParkingType() {
        return parkingType;
    }

    public void setParkingType(ParkingType parkingType) {
        this.parkingType = parkingType;
    }

    public LocalDateTime getIssueTime() {
        return issueTime;
    }

    public void setIssueTime(LocalDateTime issueTime) {
        this.issueTime = issueTime;
    }

    public LocalDateTime getVacateTime() {
        return vacateTime;
    }

    public void setVacateTime(LocalDateTime vacateTime) {
        this.vacateTime = vacateTime;
    }

    public Float getCharges() {
        return charges;
    }

    public void setCharges(Float charges) {
        this.charges = charges;
    }

    public boolean isValid() {
        return isValid;
    }

    public void setValid(boolean valid) {
        isValid = valid;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "ticketId='" + ticketId + '\'' +
                ", parkingSpotId='" + parkingSpotId + '\'' +
                ", vehicleIdNumber='" + vehicleIdNumber + '\'' +
                ", vehicleType=" + vehicleType +
                ", parkingType=" + parkingType +
                ", issueTime=" + issueTime +
                ", vacateTime=" + vacateTime +
                ", charges=" + charges +
                ", isValid=" + isValid +
                '}';
    }
}
