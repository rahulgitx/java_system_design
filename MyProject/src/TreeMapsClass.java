import java.util.*;

public class TreeMapsClass {
    public static void main(String[] args) {
        TreeMap<Integer, Integer> mp = new TreeMap<>();
        mp.put(1,2);
        mp.put(2,3);
        mp.put(1,1);
        mp.remove(1);
        for(Map.Entry<Integer, Integer> entry : mp.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
