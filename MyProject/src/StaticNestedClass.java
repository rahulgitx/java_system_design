import java.util.TreeSet;

public class StaticNestedClass {
    public static void main(String[] args) {
        TreeSet<Dog> d = new TreeSet<>();
        d.add(new Dog(1));
        d.add(new Dog(3));

        System.out.println(d.size());
    }
    static class Dog{
        Dog(int i){}
    }
}
