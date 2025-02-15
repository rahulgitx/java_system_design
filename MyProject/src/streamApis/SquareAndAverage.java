package streamApis;

import java.util.Arrays;
import java.util.List;

public class SquareAndAverage {
    public static void main(String...args){
        List<Integer> list = Arrays.asList(1,3,10,20,30,15,1,2,2,10,30,19,3);

        double res1 = list.stream().mapToInt(i -> i*i).average().getAsDouble();
        double res2 = list.stream().map(i->i*i).mapToInt(i->i).average().getAsDouble();
        double resFiltered = list.stream().mapToInt(i->i*i).filter(i -> i>5).average().getAsDouble();
        System.out.println(res1);
        System.out.println(res2);
        System.out.println(resFiltered);
    }

}
