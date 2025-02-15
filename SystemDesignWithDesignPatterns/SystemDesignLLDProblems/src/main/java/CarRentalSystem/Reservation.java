package CarRentalSystem;

import CarRentalSystem.vehicle.Vehicle;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Setter
@Getter
public class Reservation {
    private User user;
    private Vehicle vehicle;
    private Instant bookTime;
    private int bookDuration;
    private Store store;
    private Bill bill;
    public Reservation(User user, Vehicle vehicle, int bookDuration, Store store){
        this.user = user;
        this.vehicle = vehicle;
        this.bookTime = Instant.now();
//        this.bookDuration = bookDuration;
        this.store = store;
        this.bill = new Bill(vehicle, bookDuration);
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "user=" + user +
                ", vehicle=" + vehicle +
                ", bookTime=" + bookTime +
                ", bookDuration=" + bookDuration +
                ", store=" + store +
                ", bill=" + bill +
                '}';
    }
}
