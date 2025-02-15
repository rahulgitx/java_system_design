package systemdesign.factoryPattern;

import systemdesign.factoryPattern.shapes.Pentagon;
import systemdesign.factoryPattern.shapes.Shape;
import systemdesign.factoryPattern.shapes.Square;
import systemdesign.factoryPattern.shapes.Triangle;

public class FactoryClass {
    private Shape obj;
    public Shape createObject(String shape){
        switch(shape){
            case "Square":
                obj = new Square();
            case "Triangle":
                obj = new Triangle();
            case "Pentagon":
                obj = new Pentagon();
        }
        return obj;
    }
}
