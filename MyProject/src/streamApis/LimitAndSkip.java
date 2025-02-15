package streamApis;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LimitAndSkip {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,3,10,20,30,15,1,2,2,10,30,19,3);
        List<Integer> limit5 = list.stream().limit(5).collect(Collectors.toList());
        System.out.println(limit5);

        Integer sumOffirst5 = list.stream().limit(5).reduce(Integer::sum).get();
        System.out.println(sumOffirst5);

        List<Integer> skipFirst5 = list.stream().skip(5).collect(Collectors.toList());
        System.out.println(skipFirst5);
     }
}
