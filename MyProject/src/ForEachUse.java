import java.util.ArrayList;
import java.util.List;

public class ForEachUse {
    public static void main(String[] args){
        List<Integer> arr = new ArrayList<>();
        arr.add(1); arr.add(5); arr.add(0); arr.add(-1);

        arr.forEach(i -> i++);
//        for(int i:arr) System.out.println(i);
        arr.forEach(i -> System.out.println(i));
    }
}
