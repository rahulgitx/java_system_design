package streamApis;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenAndOdds {
    public static void main(String...args){
        List<Integer> list = Arrays.asList(1,3,10,20,30,15,1,2,2,10,30,19,3);

        List<Integer> evenList = list.stream().filter(i -> i%2==0).sorted().collect(Collectors.toList());
        List<Integer> oddList = list.stream().filter(i->i%2==1).sorted().collect(Collectors.toList());
        System.out.println(evenList);
        System.out.println(oddList);

        int[] arr = {1,2,3,4,5,45,3,2,2};
        List<Integer> arrList = Arrays.stream(arr).map(a->a).boxed().collect(Collectors.toList());
    }
}
