package streamApis;

import java.util.*;
import java.util.stream.IntStream;

public class IntstreamClass {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6};
        IntStream intStream = Arrays.stream(arr);
        IntStream.of(1,2,4,4);
//        IntStream intstream = Arrays.asList(1,2,3,4).stream();
    }
}
