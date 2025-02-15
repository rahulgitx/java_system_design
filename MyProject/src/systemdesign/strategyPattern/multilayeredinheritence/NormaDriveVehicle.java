package systemdesign.strategyPattern.multilayeredinheritence;

public class NormaDriveVehicle extends Vehicle{
    @Override
    public void drive() {
        System.out.println("Normal drive capabilities");
    }
}
