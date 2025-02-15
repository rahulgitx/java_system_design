import java.util.*;

public class RandomNumbers {
    public static void main(String[] args) {
        Random rand = new Random();
        System.out.println(100+rand.nextInt(100));
        List<Integer> list = new ArrayList<>();
        list.remove(0);
    }
}
