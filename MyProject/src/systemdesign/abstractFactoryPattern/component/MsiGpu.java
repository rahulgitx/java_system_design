package systemdesign.abstractFactoryPattern.component;

public class MsiGpu implements Gpu{
    @Override
    public void assemble() {
        System.out.println("This is MsiGpu");
    }
}
