import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ArrayListClass {
    public static void main(String[] args){
        List<Integer> arr = new ArrayList<>();

        arr.add(1); arr.add(5); arr.add(0); arr.add(-1);
        Collections.sort(arr);

        for(Integer i:arr) System.out.println(i);

        List<List<Integer>> list = new ArrayList<>();
        list.add(arr);
        List<List<Integer>> multiList = new ArrayList<>();
    }
}
