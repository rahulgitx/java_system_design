package parkinglotUdemy.parkingspot;
import static parkinglotUdemy.constants.Charges.LARGE_WHEELER_HOURLY_CHARGE;
public class LargeWheelerParkingSpot extends ParkingSpot{
    public LargeWheelerParkingSpot(String id){
        super(id, LARGE_WHEELER_HOURLY_CHARGE);
    }
}
