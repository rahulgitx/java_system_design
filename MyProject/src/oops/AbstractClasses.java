package oops;

// this class cannot be instantiated
// it can or cannot have an abstract method
abstract class Parent{
    int a;
    void func1(int a){
        System.out.println("parent method func1 " + a);
    }
    abstract void func2(int b);  // this is also called a pure virtual method i.e a method that is needed to be defined in child class
    // a virtual function is a function that is supposed to redefined in the child class
}
class ChildClass extends Parent{

    // this annotation is not necessary here
    // but it is necessary to have implementation of the abstract method
    @Override
    void func2(int b) {
        System.out.println("child method func2 " + b);
    }

    void func1(int a){
        super.func1(a); // calls the parent class first
        System.out.println("child method func1 " + a);
    }
}


public class AbstractClasses {
    public static void main(String[] args) {
        Parent obj = new ChildClass();
        obj.func1(1);
        obj.func2(1);
    }
}
