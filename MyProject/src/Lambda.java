import javafx.util.Pair;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Lambda {
    public static void main(String[] args){
        A a = new A(){
            @Override
            public void methodA(){
                System.out.println("methodA complete implementation");
            }
        };
        a.methodA();

        A a2 = () -> {
            System.out.println("methodA lambda implementation with curly braces");
        };
        a2.methodA();

        A a3 = () -> System.out.println("one liner methodA");
        a3.methodA();

        B b = new B(){
            @Override
            public void methodB(char c){
                System.out.println("Complete implementation of methodB: {}" + c);
            }
        };
        System.out.println("------------"+b.toString());
        b.methodB('x');

        B b2 = (c) -> {
            System.out.println("Curly braces implementation of methodB: {}" + c);
        };
        b2.methodB('y');

        B b3 = c -> System.out.println("Complete implementation of methodB: {}" + c);
        b3.methodB('z');


        Function<Integer, Integer> func = m -> m*m;
        Consumer<Integer> cons = (m) -> m++;
        Supplier<Integer> sup = () -> 12;
        Predicate<Integer> pred = (m) -> m%2==0;
//        Pair.of()

    }
}

interface A{
    public void methodA();
}

interface B{
    public void methodB(char c);
}


