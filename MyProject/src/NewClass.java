import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;

public class NewClass {
    public static void main(String[] args) {
        Parent obj1 = new Child1(4); // upcasting // no child properties would be accessible accept for the overriden methods
        //
        obj1.parentMethod();
//        obj1.childMethod();
        System.out.println(obj1.getA()); // overrding attribute

//        System.out.println();


        Child1 child = (Child1) new Parent(5); // will throw error
        child.childMethod();

        //Parent constructor called
        //Child class constructor called
        //child method called

        System.out.println(func("aaaadddddbbbcc"));
    }

    // O(n),
    public static String func(String s){
        int[] frequency = new int[26];

        // O(n)
        for(int i=0; i<s.length(); i++){
            frequency[s.charAt(i)-'a']++;
        }

        StringBuilder str = new StringBuilder();

        // O(k)
        for(int i=0; i<26; i++){
            if(frequency[i]==0) continue;

            str.append((char)('a'+i));
            str.append((char)('0'+frequency[i]));
        }

        // O(n)
        return str.toString();
    }
}



class Parent{
    private int a=1;
    protected int b;

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public Parent(int c){
        System.out.println("Parent constructor called");
    }
    public void parentMethod(){
        System.out.println("parent method called");
    }
}

class Child1 extends Parent{
    private int c;
    private int a=4;

    public int getC() {
        return c;
    }
    public int getA(){
        return a;
    }
    public Child1(int c){
        super(c);
        System.out.println("Child class constructor called");
    }
    public void childMethod(){
        System.out.println(super.getB());
        System.out.println("child method called");
        super.getA();
    }
}

/*
class Employee {
    String name;
    String address;
    String city;
}

public static void main (String[] args) {
    Employee emp = new Employee();
    emp.setName("ABC");
    emp.setAddress("West Bangal");
    modify(emp);
    system.out(emp.getName());    // XYZ
}

public static void modify(Employee emp) {
    emp.setName("XYZ");
    emp = new Employee();
    emp.setName("QA");
    emp = null;
}

 */



