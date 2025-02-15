package parkinglotUdemy.parkingspot;

import static parkinglotUdemy.constants.Charges.FOUR_WHEELER_HOURLY_CHARGE;

public class FourWheelerParkingSpot extends ParkingSpot{
    public FourWheelerParkingSpot(String id) {
        super(id, FOUR_WHEELER_HOURLY_CHARGE);
    }
}
