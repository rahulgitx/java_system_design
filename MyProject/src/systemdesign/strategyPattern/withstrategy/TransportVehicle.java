package systemdesign.strategyPattern.withstrategy;

import systemdesign.strategyPattern.withstrategy.strategy.NormalDriveStrategy;

public class TransportVehicle extends Vehicle{
    TransportVehicle(){
        super(new NormalDriveStrategy());
    }
}
