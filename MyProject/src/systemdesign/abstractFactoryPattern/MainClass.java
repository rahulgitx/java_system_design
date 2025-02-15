package systemdesign.abstractFactoryPattern;

import systemdesign.abstractFactoryPattern.component.Gpu;
import systemdesign.abstractFactoryPattern.component.Monitor;
import systemdesign.abstractFactoryPattern.factory.AsusManufacturer;
import systemdesign.abstractFactoryPattern.factory.Company;
import systemdesign.abstractFactoryPattern.factory.MsiManufacturer;

public class MainClass {
    public static void main(String[] args) {
            Company msi = new MsiManufacturer();
            Gpu msiGpu = msi.createGpu();
            Monitor msiMonitor = msi.createMonitor();

            Company asus = new AsusManufacturer();
            Gpu asusGpu = msi.createGpu();
            Monitor asusMonitor = msi.createMonitor();
    }
}
