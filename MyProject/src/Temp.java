import javax.sound.midi.Soundbank;
import java.util.*;

public class Temp {
    public static int n;

    public static void main(String[] args) {
        long a = Long.MIN_VALUE;
        a = Long.MAX_VALUE;
        List<Integer> list = new ArrayList<>(1);
//        list.set()
        HashMap<Integer, Integer> mp = new HashMap<>();
        for(Map.Entry<Integer, Integer> entry : mp.entrySet()){

        }
        String str=null;
        Class<?> c = str.getClass();

        InterfaceA intA = new ChildOfInterface();
        intA.show();
        intA.defaultMethod();
    }

}

interface InterfaceA{
    default void defaultMethod(){
        System.out.println("running default");
    }
    void show();
}

interface InterfaceB{
    void show();
    void show2();
}

class ChildOfInterface implements InterfaceA, InterfaceB{

    @Override
    public void show() {
        System.out.println("show");
    }

    @Override
    public void show2() {
        System.out.println("show2");
    }
}