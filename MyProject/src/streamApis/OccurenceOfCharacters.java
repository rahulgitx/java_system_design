package streamApis;
import java.util.*;
import java.util.stream.Collectors;

public class OccurenceOfCharacters {
    public static void main(String[] args) {
        String s = "absdfsesdgalksdflksfe";
        Map<Character, Long> mp = Arrays.stream(s.split("")).collect(Collectors.groupingBy(x->x.charAt(0), Collectors.counting()));
        System.out.println(mp);
    }
}
