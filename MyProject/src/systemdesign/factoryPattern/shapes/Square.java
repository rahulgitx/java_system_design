package systemdesign.factoryPattern.shapes;

public class Square implements Shape{
    private int sides;
    @Override
    public void describeShape() {
        System.out.println("This is a square");
    }
}
