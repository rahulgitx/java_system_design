import java.util.Deque;
import java.util.LinkedList;

public class DequeuJava {
    public static void main(String...args){
        Deque<Integer> dq = new LinkedList<>();
        dq.add(1); dq.add(3); dq.add(4); dq.add(5);
        dq.addFirst(3); dq.addLast(4);

        dq.peekFirst(); dq.peekLast(); dq.pollFirst(); dq.pollLast  ();
//        dq.offer()
    }
}
