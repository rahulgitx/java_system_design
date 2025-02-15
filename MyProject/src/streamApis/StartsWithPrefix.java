package streamApis;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StartsWithPrefix {
    public static void main(String...args){
        List<Integer> list = Arrays.asList(1,3,10,20,30,15,1,2,2,10,-230,219,3);

        List<Integer> pref2List = list.stream()
                .map(i-> String.valueOf(i))
                .filter( i -> i.startsWith("2") || i.startsWith("-2"))
                .map(i->Integer.valueOf(i))
                .collect(Collectors.toList());
        System.out.println(pref2List);
    }
}
