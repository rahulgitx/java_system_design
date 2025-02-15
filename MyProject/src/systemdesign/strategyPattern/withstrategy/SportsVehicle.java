package systemdesign.strategyPattern.withstrategy;

import systemdesign.strategyPattern.withstrategy.strategy.SpecialDriveStrategy;

public class SportsVehicle extends Vehicle{
    SportsVehicle(){
        super(new SpecialDriveStrategy());
    }
}
