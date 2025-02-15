package streamApis;

import java.util.Arrays;
import java.util.List;

public class AverageOfNumbers {
    public static void main(String...args){
        List<Integer> list = Arrays.asList(1,3,10,20,30,15,1,2,2,10,30,19,3);

        double res = list.stream().mapToInt(i -> i).average().getAsDouble();
        System.out.println(res);
    }
}
