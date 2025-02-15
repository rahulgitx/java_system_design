package streamApis;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LazyConcept {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(4,2,45,2,5,5);
        Stream<Integer> stream = list.stream()
                .filter(n -> {
                    System.out.println(n);
                    return n%2==0;
                })
                .map(n -> {
                    System.out.println(n);
                    return n * n;});
        stream.collect(Collectors.toList());
    }
}
