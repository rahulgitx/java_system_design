package parkinglotUdemy.parkingspot;
import static parkinglotUdemy.constants.Charges.TWO_WHEELER_HOURLY_CHARGE;
public class TwoWheelerParkingSpot extends ParkingSpot{
    public TwoWheelerParkingSpot(String id){
        super(id, TWO_WHEELER_HOURLY_CHARGE);
    }
}
