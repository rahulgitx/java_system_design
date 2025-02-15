package streamApis;
import java.util.*;
import java.util.stream.Collectors;

public class FrequencyOfOccurrences {
    public static void main(String[] args) {
        String s = "I am learning streams api in java java in";
        Map<String, Long> mp = Arrays.stream(s.split(" "))
                .collect(Collectors.groupingBy(x->x, Collectors.counting()));
        System.out.println(mp);

        Arrays.stream(s.split("")).collect(Collectors.groupingBy(x->x, Collectors.counting()));
    }
}
