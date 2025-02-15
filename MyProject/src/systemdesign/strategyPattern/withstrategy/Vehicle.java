package systemdesign.strategyPattern.withstrategy;

import systemdesign.strategyPattern.withstrategy.strategy.DriveStrategy;

public class Vehicle {
    DriveStrategy driveStrategyObj;
    Vehicle(DriveStrategy driveStrategy){
        this.driveStrategyObj = driveStrategy;
    }

    public void drive(){
        driveStrategyObj.drive();
    }
}
