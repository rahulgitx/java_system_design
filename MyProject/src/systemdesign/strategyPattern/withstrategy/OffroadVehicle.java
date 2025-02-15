package systemdesign.strategyPattern.withstrategy;

import systemdesign.strategyPattern.withstrategy.strategy.SpecialDriveStrategy;

public class OffroadVehicle extends Vehicle{
    OffroadVehicle(){
        super(new SpecialDriveStrategy());
    }
}
