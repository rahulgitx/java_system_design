package streamApis;
import java.util.*;

public class FindSecondHighest {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(4,3,21,4,56,6,34);
        int n = list.stream()
                .sorted((a,b) -> b-a)
                .skip(1)
                .findFirst().get();
        System.out.println(n);

        String s = "I am learning streams in java";
        String ans = Arrays.stream(s.split(" "))
                .sorted((a,b) -> b.length()-a.length())
                .skip(1)
                .findFirst().get();
        System.out.println(ans);
    }
}
