package systemdesign.strategyPattern.multilayeredinheritence;


// this won't work because suppose we want to have another method accelerate() which should be common to all
public abstract class Vehicle {
    int speed = 0;
    public abstract void drive();
    public int accelerate(){
        this.speed += 1;
        return speed;
    }
}

