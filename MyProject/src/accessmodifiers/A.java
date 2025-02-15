package accessmodifiers;

public class A {
    public static void main(String[] args) {
        C c = new C();
        System.out.println(c.cattrib);
        System.out.println(c.toString());
    }
    public class D{
        public void func(){
            System.out.println("this is D");
        }
    }
}

