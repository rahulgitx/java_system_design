import java.util.*;

public class WildCardUse {
    public static void main(String[] args) {
        List<?> list = new ArrayList<>();
        list.add(null);
        list.add(null);
        System.out.println(list.size());

        List<Object> list2 = new ArrayList<>();
        list2.add("ad");
        list2.add(1);
        if(list2.get(0) instanceof String){
            System.out.println("yes");
        }

//        Object obj = Pair.of();
    }


}
