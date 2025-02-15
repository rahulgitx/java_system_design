package systemdesign.strategyPattern.withstrategy.strategy;

public class SpecialDriveStrategy implements DriveStrategy{
    @Override
    public void drive() {
        System.out.println("Special drive strategy");
    }
}
