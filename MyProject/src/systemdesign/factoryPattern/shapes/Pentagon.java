package systemdesign.factoryPattern.shapes;

public class Pentagon implements Shape{
    private int sides;
    @Override
    public void describeShape() {
        System.out.println("This is a Pentagon");
    }
}
