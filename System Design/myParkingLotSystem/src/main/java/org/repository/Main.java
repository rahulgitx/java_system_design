package org.repository;

import com.sun.net.httpserver.Authenticator;
import org.repository.models.*;
import org.repository.models.parkingSpot.*;
import org.repository.models.vehicle.Bus;
import org.repository.models.vehicle.Car;
import org.repository.models.vehicle.Truck;
import org.repository.models.vehicle.VehicleType;

import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ParkingLot parkingLot = ParkingLot.getInstance();

        Address address = new Address();
        address.setPlotNumber("1596");
        address.setAddressLine1("Sector 23 East Pocket");
        address.setAddressLine2("Near Shiva temple");
        address.setCity("Gurgaon");
        address.setCountry("India");
        address.setPinCode(122017);
        parkingLot.setAddress(address);

        // adding floor 1
        parkingLot.addFloor(new Floor("1"));
        //adding floor 2
        parkingLot.addFloor(new Floor("2"));

        // Adding entrance panel
        EntranceTerminal entranceTerminal1 = new EntranceTerminal("1");
        if(parkingLot.addEntranceTerminal(entranceTerminal1)){
            System.out.println("successfully added panel 1");
        }
        // Adding exit panel
        ExitTerminal exitTerminal1 = new ExitTerminal("1");
        if(parkingLot.addExitTerminal(exitTerminal1)){
            System.out.println("successfully added exit panel 1");
        };
        // Adding another entrance panel
        EntranceTerminal entranceTerminal2 = new EntranceTerminal("2");
        if(parkingLot.addEntranceTerminal(entranceTerminal2)){
            System.out.println("successfully added panel 2");
        }
        // Adding exit panel
        ExitTerminal exitTerminal2 = new ExitTerminal("2");
        if(parkingLot.addExitTerminal(exitTerminal2)){
            System.out.println("successfully added exit panel 2");
        };

        // add car parking spot at floor 1
        CarParkingSpot carParkingSpot1 = new CarParkingSpot("c1", ParkingType.CAR);
        String floorId1 = "1";
        parkingLot.addParkingSpot(carParkingSpot1,floorId1);

        // add car parking spot at floor 2
        CarParkingSpot carParkingSpot2 = new CarParkingSpot("c2", ParkingType.CAR);
        String floorId2 = "2";
        parkingLot.addParkingSpot(carParkingSpot2,floorId2);

        // add bike parking stop in floor 1
        BikeParkingSpot bikeParkingSpot1 = new BikeParkingSpot("b1", ParkingType.BIKE);
        parkingLot.getFloors().get(floorId1).addParkingSpot(bikeParkingSpot1);

        // car1 came
        Car car1 = new Car("HP-c1", VehicleType.CAR);

        // checking from entrance 1 if spot is available
        System.out.println(entranceTerminal1.isSpotAvailable(car1));

        // park car1 and print issued ticket
        Ticket ticket = entranceTerminal1.issueTicket(car1);
        System.out.println(ticket);

        // truck1 came.. checking available spot from entrance2
        Truck truck1 = new Truck("HP-t1", VehicleType.TRUCK);
        System.out.println(entranceTerminal2.isSpotAvailable(truck1));

        // car2 came.. checking available spot from entrance 1
        Car car2 = new Car("c2", VehicleType.CAR);
        System.out.println(entranceTerminal1.isSpotAvailable(car2));

        // parking from entrance 2 and issueing ticket
        Ticket ticketc2 = entranceTerminal2.issueTicket(car2);
        System.out.println(ticketc2);

        // Adding spot for large vehicles
        LargeParkingSpot largeParkingSpot1 = new LargeParkingSpot("lp1",ParkingType.LARGEVEHICLE);
        parkingLot.addParkingSpot(largeParkingSpot1,floorId2);

        // bus1 came
        Bus bus1 = new Bus("HP-b1",VehicleType.BUS);
        System.out.println(entranceTerminal1.isSpotAvailable(bus1));

        // issue ticket for bus1
        Ticket ticketb2 = entranceTerminal1.issueTicket(bus1);
        System.out.println(ticketb2);

        // checking for truck 1
        System.out.println(entranceTerminal1.isSpotAvailable(truck1));

        // bus1 leaving
        exitTerminal2.exitFromParkingLotAndGetCharges(ticketb2);
        System.out.println(ticketb2);


    }
}