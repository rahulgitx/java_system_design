package streamApis;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatteningClass {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1,2,3,4);
        List<Integer> list2 = Arrays.asList(5,4,24,6);

        List<Integer> list = Stream.of(list2, list1).flatMap(l -> l.stream()).sorted().collect(Collectors.toList());

    }
}
