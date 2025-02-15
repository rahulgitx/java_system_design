package systemdesign.abstractFactoryPattern.component;

public class MsiMonitor implements Monitor{
    @Override
    public void assemble() {
        System.out.println("This is MsiMonitor");
    }
}
