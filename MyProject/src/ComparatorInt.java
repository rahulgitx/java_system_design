import java.util.*;
import java.util.Arrays;

public class ComparatorInt {
    static int getMappedValue(Integer a, int[] mapping){
        int res = 0, m=1;
        while(a>0){
            res += mapping[a%10] * m;
            a = a/10;
            m = m*10;
        }
        return res;
    }
    public static void main(String...args){
        int[] arr = new int[]{4,2,4,63,2,1,6};
        Integer[] intArr = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        int[] newArr = Arrays.stream(intArr).mapToInt(Integer::intValue).toArray();
        int[] mapping = new int[10];

    }
}
