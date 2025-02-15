import java.util.ArrayList;
import java.util.HashSet;

public class HashSetJava {
    public static void main(String[] args) {
        HashSet<Integer[]> st = new HashSet<>();
        Integer[] arr1 = new Integer[]{1,2,3};
        Integer[] arr2 = new Integer[]{1,2,4};
        Integer[] arr3 = new Integer[]{1,2,3};
        st.add(arr1); st.add(arr2); st.add(arr3);

        Integer[] arr4 = new Integer[]{1,2,3};
        System.out.println(st.size());
        System.out.println(st.contains(arr4));

        HashSet<ArrayList> set = new HashSet<>();

        // create ArrayList list1
        ArrayList<Integer> list1 = new ArrayList<>();

        // create ArrayList list2
        ArrayList<Integer> list2 = new ArrayList<>();

        // Add elements using add method
        list1.add(1);
        list1.add(2);
        list2.add(1);
        list2.add(2);
        set.add(list1);
        set.add(list2);
        System.out.println(set.size());
        HashSet<Pairr> st1 = new HashSet<>();
        st1.add(new Pairr(1,2));
        st1.add(new Pairr(1,2));
        System.out.println(st1.size());
        double a = Math.sqrt(15);
        System.out.println(a);
//        HashSet<int[]> set = f
    }
}

class Pair{
    public int first;
    public int second;
    public Pair(int a, int b){
        this.first = a; this.second = b;
    }
}