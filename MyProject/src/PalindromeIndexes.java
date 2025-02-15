import java.util.*;

public class PalindromeIndexes {
    public static boolean areSame(String s, String t){
        if(s.length() != t.length()) return false;

        int n = s.length(), i=0, j=t.length()-1;
        while(i<n && j>=0){
            if(s.charAt(i)!=t.charAt(j)) return false;
            i++; j--;
        }
        return true;
    }
    public static boolean isPalindrome(StringBuilder s){
        int i =0, j = s.length()-1;
        while(i<=j){
            if(s.charAt(i) != s.charAt(j)) return false;
            i++; j--;
        }
        return true;
    }
    public static List<Integer[]> getIndexes(String[] arr){
        List<Integer[]> res = new ArrayList<>();
        int n = arr.length;
        for(int i=0; i<n; i++){
            StringBuilder s  = new StringBuilder(arr[i]);
            for(int j=0; j<n; j++){
                if(i==j) continue;
                StringBuilder t1 = new StringBuilder(s);
                t1.append(arr[j]);
                StringBuilder t2 = new StringBuilder(arr[j]);
                t2.append(s);
                if(isPalindrome(t1) || isPalindrome(t1)){
                    res.add(new Integer[]{i,j});
                }
            }
        }
        return res;
    }
    public static void main(String[] args) {
        String[] arr = {"a",""};
        List<Integer[]> res = getIndexes(arr);
        for(int i=0; i<res.size(); i++){
            System.out.println(res.get(i)[0] + " "+res.get(i)[1]);
        }
    }
}
