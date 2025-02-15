package streamApis;
import java.util.*;
import java.util.stream.Collectors;

public class WordsWithNVowels {
    public static void main(String[] args) {
        String s = "I am learning streams in java";
        List<String> res = Arrays.stream(s.split(" "))
                .filter(x -> x.replaceAll("[^aeiouAEIOU]","").length()==2)
                .collect(Collectors.toList());
        System.out.println(res);
    }
}
