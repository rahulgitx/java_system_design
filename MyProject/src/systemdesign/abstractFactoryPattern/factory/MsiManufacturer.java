package systemdesign.abstractFactoryPattern.factory;

import systemdesign.abstractFactoryPattern.component.Gpu;
import systemdesign.abstractFactoryPattern.component.Monitor;
import systemdesign.abstractFactoryPattern.component.MsiGpu;
import systemdesign.abstractFactoryPattern.component.MsiMonitor;

public class MsiManufacturer extends Company {

    @Override
    public Gpu createGpu() {
        return new MsiGpu();
    }

    @Override
    public Monitor createMonitor() {
        return new MsiMonitor();
    }
}
