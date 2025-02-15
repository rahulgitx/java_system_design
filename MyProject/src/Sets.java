import java.util.*;

public class Sets {
    public static void main(String...args){
        TreeSet<List<Integer>> set  = new TreeSet<>();
        List<Integer> list1 = new ArrayList<>();
        list1.add(3); list1.add(2); list1.add(1);
//        List<Integer> list2 = Arrays.asList(1,1,4);
//
////        set.add(list1);
//        set.add(list2);
//
//        for(List<Integer> l : set){
//            System.out.println(l);
//        }
//
//        HashSet<Integer[]> st = new HashSet<>();
//        st.add(new Integer[]{1,2,3});
//        if(st.contains(new Integer[]{1,2,3})) System.out.println("containts");

        TreeSet<Integer> sett = new TreeSet<>((a, b) -> {
            if(a < b) return 1;
            return -1;
        });
        sett.add(4);
        sett.add(2);
        sett.add(3);
        sett.add(5);
//        sett.remove(sett.first());
        sett.pollFirst();
        for(Integer i : sett) System.out.println(i);
        System.out.println(sett.first() + " " + sett.last());
        TreeSet<Integer[]> setPair = new TreeSet<>((a, b) -> {
            if(a[0] < b[0]) return 1;
            else if(a[0].equals(b[0])){
                if(a[1] < b[1]) return 1;
                return -1;
            }
            return -1;
        });
        setPair.add(new Integer[]{1,2});
        setPair.add(new Integer[]{2,2});
        setPair.add(new Integer[]{2,3});
        setPair.add(new Integer[]{4,2});
        System.out.println(setPair.contains(new Integer[]{1,2}));
        for(Integer[] i : setPair){
            System.out.println(i[0] + " " + i[1]);
        }

        TreeSet<Pairr> pairrSet = new TreeSet<>();
        pairrSet.add(new Pairr(1, 2));
        System.out.println(pairrSet.contains(new Pairr(1,2)));



        HashSet<Pairr> pairrHashSet = new HashSet<>();
        pairrHashSet.add(new Pairr(1,2));
        System.out.println(pairrHashSet.contains(new Pairr(1,2)));
        Pairr p = new Pairr(1,2);
    }



}

//class Pairr implements Comparable<Pairr>{
//    int val;
//    int freq;
//    public Pairr(int v, int f){
//        this.val = v;
//        this.freq = f;
//    }
//    public int compareTo(Pairr p){
//        if(this.freq == p.freq){
//            return this.val - p.val;
//        }else{
//
//            return this.freq - p.freq;
//        }
//    }
//}
class Pairr implements Comparable<Pairr>{
    int first;
    int second;
    public Pairr(int first, int second){
        this.first = first;
        this.second = second;
    }

    public int compareTo(Pairr p){
        if(this.first == p.first) return this.second - p.second;
        return this.first - p.first;
    }
}