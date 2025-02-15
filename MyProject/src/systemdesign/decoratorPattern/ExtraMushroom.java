package systemdesign.decoratorPattern;

public class ExtraMushroom extends ToppingsDecorator{
    BasePizza basePizza;

    public ExtraMushroom(BasePizza basePizza){
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return basePizza.cost()+20;
    }
}
