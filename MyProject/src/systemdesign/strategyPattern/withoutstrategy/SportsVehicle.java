package systemdesign.strategyPattern.withoutstrategy;

public class SportsVehicle extends Vehicle{
    public void drive(){
        System.out.println("uses special driving capabilities");
    }
    // this code is duplicate in sportsvehicle and offroadvehicle
}
