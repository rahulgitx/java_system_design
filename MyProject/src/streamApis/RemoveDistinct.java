package streamApis;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RemoveDistinct {
    public static void main(String[] args) {
        String s = "dabcadefg";
//        IntStream arr = s.chars();
//        System.out.println(arr);
        Arrays.stream(s.split("")).distinct().forEach(System.out::print);
        System.out.println();
        String ans = Arrays.stream(s.split("")).distinct().collect(Collectors.joining());
        System.out.println(ans);
    }
}
