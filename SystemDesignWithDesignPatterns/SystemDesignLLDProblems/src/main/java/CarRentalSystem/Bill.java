package CarRentalSystem;

import CarRentalSystem.vehicle.Vehicle;

public class Bill {
    private User user;
    private Vehicle vehicle;
    private float amountToBePaid;
    public Bill(Vehicle vehicle, int hours){
        this.amountToBePaid = vehicle.getSecurityMoney() + vehicle.getHourlyPrice()*hours;
    }

    public void MakePayment(){
        System.out.println("Making payement...");
    }

    @Override
    public String toString() {
        return "Bill{" +
                "user=" + user +
                ", vehicle=" + vehicle +
                ", amountToBePaid=" + amountToBePaid +
                '}';
    }
}
