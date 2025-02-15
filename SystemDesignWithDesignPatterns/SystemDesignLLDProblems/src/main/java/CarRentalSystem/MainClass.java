package CarRentalSystem;
import CarRentalSystem.vehicle.Car;
import CarRentalSystem.vehicle.Vehicle;
import CarRentalSystem.vehicle.VehicleType;

import java.util.*;

public class MainClass{
    public static void main(String[] args) {
        CarRentalSystem carRentalSystem = createTempCarRental();

        Store myStore = carRentalSystem.getStores().get("Delhi");
        User userNew = new User();
        List<Vehicle> vehicleList = myStore.getBikeVehicleInventory().getVehicleList();
        Reservation reservation = myStore.makeReservation(userNew, vehicleList.get(0), 3);
        System.out.println(reservation);

        Bill bill = myStore.completeReservation(reservation);
        System.out.println(bill);

        bill.MakePayment();
    }

    private static CarRentalSystem createTempCarRental(){
        Store store1 = new Store();
        store1.setLocation("Delhi");
        store1.setStoreId("01");
        store1.setCarVehicleInventory(createBikeInventory());
        store1.setBikeVehicleInventory(createCarInventory());

        Store store2 = new Store();

        HashMap<String, Store> storeMap = new HashMap<>();
        storeMap.put("Delhi", store1);
        storeMap.put("Mumbai", store2);


        User user1 = new User();
        user1.setAge(21);
        user1.setName("Kevin");
        user1.setUserId("234");
        user1.setLicenseNumber("LK234KNILLI94L");
        HashMap<String, User> userMap = new HashMap<>();
        userMap.put("234", user1);
//        userMap.put("212", user2);


        CarRentalSystem carRentalSystem = new CarRentalSystem();
        carRentalSystem.setStores(storeMap);
        return carRentalSystem;
    }
    private static VehicleInventory createBikeInventory(){
        Vehicle bike1 = new Car(50);
        bike1.setVechicleId(03);
        bike1.setVehicleType(VehicleType.Bike);
        bike1.setCarPrice(200000f);
        bike1.setAvailable(true);

        Vehicle bike2 = new Car(40);
        bike2.setVechicleId(04);
        bike2.setVehicleType(VehicleType.Bike);
        bike2.setCarPrice(150000f);
        bike2.setAvailable(true);

        List<Vehicle> bikeVehicleList = new ArrayList<>();
        bikeVehicleList.add(bike1);
        bikeVehicleList.add(bike2);

//        return bikeVehicleList;
        VehicleInventory vehicleInventory = new VehicleInventory();
        vehicleInventory.setVehicleList(bikeVehicleList);
        return vehicleInventory;

    }
    private static  VehicleInventory createCarInventory(){
        Vehicle car1 = new Car(100);
        car1.setVechicleId(01);
        car1.setVehicleType(VehicleType.Car);
        car1.setCarPrice(1500000f);
        car1.setAvailable(true);

        Vehicle car2 = new Car(90);
        car2.setVechicleId(02);
        car2.setVehicleType(VehicleType.Car);
        car2.setCarPrice(1200000f);
        car2.setAvailable(true);


        List<Vehicle> carVehicleList = new ArrayList<>();
        carVehicleList.add(car1);
        carVehicleList.add(car2);

        VehicleInventory vehicleInventory = new VehicleInventory();
        vehicleInventory.setVehicleList(carVehicleList);
        return vehicleInventory;
    }
}


