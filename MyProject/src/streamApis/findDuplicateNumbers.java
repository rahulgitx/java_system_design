package streamApis;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class findDuplicateNumbers {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,3,10,20,30,15,1,2,2,10,30,19,3);

        Set<Integer> set = list.stream().filter(i -> Collections.frequency(list, i)>1).collect(Collectors.toSet());
//        List<Integer> lst = list.stream().filter(i -> Collections.frequency(list, i)>1);
        System.out.println(set);
//        System.out.println("list: " + lst);

        // better way:
        HashSet<Integer> set1 = new HashSet<>();
        Set<Integer> improvedSolution = list.stream().filter(i -> !set1.add(i)).collect(Collectors.toSet());
        System.out.println("Improved:" + improvedSolution);
    }
}
