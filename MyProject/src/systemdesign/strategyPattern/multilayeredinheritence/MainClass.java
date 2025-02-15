package systemdesign.strategyPattern.multilayeredinheritence;

public class MainClass {
    public static void main(String[] args) {
        NormaDriveVehicle normaDriveVehicle = new NormaDriveVehicle();
        normaDriveVehicle.drive();
        System.out.println(normaDriveVehicle.accelerate());

        SpecialDriveVehicle specialDriveVehicle = new SpecialDriveVehicle();
        specialDriveVehicle.drive();
        System.out.println(specialDriveVehicle.accelerate());
    }
}
