package streamApis;

import java.util.Arrays;
import java.util.List;

public class SecondHighestFrequency {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,3,10,20,30,15,1,2,2,10,30,19,3);

//        int res = list.stream().filter()
        int res = list.stream().distinct().sorted((a, b) -> (b-a)).skip(1).findFirst().orElse(-1);
        System.out.println(res);
    }
}
