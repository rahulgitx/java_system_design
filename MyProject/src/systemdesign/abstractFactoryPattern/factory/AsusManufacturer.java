package systemdesign.abstractFactoryPattern.factory;

import systemdesign.abstractFactoryPattern.component.AsusGpu;
import systemdesign.abstractFactoryPattern.component.AsusMonitor;
import systemdesign.abstractFactoryPattern.component.Gpu;
import systemdesign.abstractFactoryPattern.component.Monitor;

public class AsusManufacturer extends Company{

    @Override
    public Gpu createGpu() {
        return new AsusGpu();
    }

    @Override
    public Monitor createMonitor() {
        return new AsusMonitor();
    }
}
