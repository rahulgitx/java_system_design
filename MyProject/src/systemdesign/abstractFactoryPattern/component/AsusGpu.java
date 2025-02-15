package systemdesign.abstractFactoryPattern.component;

public class AsusGpu implements Gpu{
    @Override
    public void assemble() {
        System.out.println("This is AsusGpu");
    }
}
