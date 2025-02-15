package streamApis;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SumOfIntegers {
    public static void main(String...args){
//        List<Integer> list = Arrays.asList(1,3,10,20,30,15,1,2,2,10,30,19,3);

        List<Integer> list = new ArrayList<>();
        Integer sum = 0;
//        list.forEach(i -> System.out.println(i));
        Optional<Integer> sumOptional = list.stream().reduce((a, b) -> a+b);
//        System.out.println(sumOptional);
        sum = list.stream().reduce((a, b) -> a+b).get();
//        System.out.println(sum);
        sum = list.stream().distinct().mapToInt(a -> a).sum();
        int[] arr = {1,2,4,2,4,2,4};
        Arrays.stream(arr).distinct().reduce((a, b) -> a+b).getAsInt();
    }
}
