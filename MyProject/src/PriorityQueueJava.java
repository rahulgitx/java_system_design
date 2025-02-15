import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueJava {
    public static void main(String[] args) {
        PriorityQueue<Integer> minPQ = new PriorityQueue<>();
        minPQ.add(3);
        minPQ.add(5);
        minPQ.add(1);
        while(minPQ.size() > 0){
            System.out.println(minPQ.poll());
        }

        Comparator<Integer> comp = (o1,o2) -> {
                if(o1 < o2) return 1;
                return -1;
        };
        Comparator<Integer> c = (a, b) -> b-a;
        PriorityQueue<Integer> maxPQ = new PriorityQueue<>(comp);
        maxPQ.add(3);
        maxPQ.add(5);
        maxPQ.add(1);
        while(maxPQ.size() > 0){
            System.out.println(maxPQ.poll());
        }

        PriorityQueue<Integer[]> pqPair = new PriorityQueue<>((a,b) -> {
            if(a[0] > b[0]) return 1;
            else if(a[0] == b[0]){
                return a[1] > b[1] ? 1 : -1;
            }
            return -1;
        });
        pqPair.add(new Integer[]{1,2});

        Comparator<int[]> comp2 = (a, b)->{
            if(a[0] < b[0]) return 1;
            return -1;
        };
        PriorityQueue<int[]> pqArr = new PriorityQueue<>(comp2);
        Integer.compare(1,2);
    }
}
