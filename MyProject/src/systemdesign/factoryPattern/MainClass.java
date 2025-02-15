package systemdesign.factoryPattern;

import systemdesign.factoryPattern.shapes.Shape;

public class MainClass {
    public static void main(String[] args) {
        FactoryClass factoryClass = new FactoryClass();
        Shape squareObj = factoryClass.createObject("Square");
        squareObj.describeShape();
    }
}
