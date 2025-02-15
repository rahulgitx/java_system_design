package systemdesign.abstractFactoryPattern.component;

public class AsusMonitor implements Monitor{
    @Override
    public void assemble() {
        System.out.println("This is Asus monitor");
    }
}
