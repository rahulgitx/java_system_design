package accessmodifiers;

public class B {
    public static void main(String[] args) {
        C obj = new C();
        obj.func();
        System.out.println(obj.cattrib);
        A obja = new A();
//        A.D d = A.new D();
    }
}
