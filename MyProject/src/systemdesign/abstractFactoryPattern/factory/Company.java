package systemdesign.abstractFactoryPattern.factory;

import systemdesign.abstractFactoryPattern.component.Gpu;
import systemdesign.abstractFactoryPattern.component.Monitor;

public abstract class Company {
    public abstract Gpu createGpu();
    public abstract Monitor createMonitor();
}
