package streamApis;
import java.util.*;

public class LongestString {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,5,2,11);
        int res = list.stream().max((a,b) -> a-b).get();
//        System.out.println(res);


        String s = "I am learning streams api in java";
        String[] arr = s.split(" ");
        String str = Arrays.stream(arr).max((a,b) -> a.length()-b.length()).orElse("");  // or get()
        System.out.println(str);
    }
}
