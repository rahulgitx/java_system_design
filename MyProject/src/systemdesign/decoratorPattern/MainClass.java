package systemdesign.decoratorPattern;

public class MainClass {
    public static void main(String[] args) {
        // margherita + extra cheese
        ExtraCheese extraCheese = new ExtraCheese(new Margherita());
        System.out.println(extraCheese.cost());

        // margherita + extra mushroom
        ExtraMushroom extraMushroom = new ExtraMushroom(new Margherita());
        System.out.println(extraMushroom.cost());

        // farmhouse + extra cheese
        ExtraCheese extraCheese1 = new ExtraCheese(new FarmHouse());
        System.out.println(extraCheese1.cost());

        // extra cheese and extra mushroom in farmhouse
        ExtraCheese extraCheese2 = new ExtraCheese(new ExtraMushroom(new FarmHouse()));
        System.out.println(extraCheese2.cost());
    }
}
