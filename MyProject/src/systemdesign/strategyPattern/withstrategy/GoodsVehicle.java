package systemdesign.strategyPattern.withstrategy;

import systemdesign.strategyPattern.withstrategy.strategy.NormalDriveStrategy;

public class GoodsVehicle extends Vehicle{
    GoodsVehicle(){
        super(new NormalDriveStrategy());
    }
}
