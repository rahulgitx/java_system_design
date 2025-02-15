package systemdesign.strategyPattern.multilayeredinheritence;

public class SpecialDriveVehicle extends Vehicle{
    @Override
    public void drive(){
        System.out.println("Special drive capabilities");
    }

}
