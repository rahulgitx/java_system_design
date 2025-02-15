package multithreading;

import accessmodifiers.A;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class ThreadName {
    public static void func1(){
        System.out.println("Thread name: " + Thread.currentThread().getName());
    }
    public static void main(String[] args) {
        System.out.println("Thread name: " + Thread.currentThread().getName());
        func1();
        List<List> list = new ArrayList<>();
    }
}
