import java.util.*;
import java.util.Arrays;

public class StreamApis {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for(int i=-10; i<10; i++){
            list.add(i);
        }
        Comparator<Long[]> comp = (a,b) -> {
            if(a[0]< b[0]) return 1;
            return -1;
        };
        List<Long[]> summ = new ArrayList<>();
        Collections.sort(summ, comp);

//        list.stream().reduce(i ->)
        list.stream()
                .sorted()
                .filter(i -> i%2 == 0)
                .map(i -> i*10)
                .forEach(System.out::println);

    }
}
