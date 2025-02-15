import java.util.*;

public class FruityTransformation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String P = "apple"; // Input sequence P
        String Q = "cqqnf"; // Input sequence Q

        int result = canSynchronize(P, Q);
        System.out.println(result);
    }

    public static int canSynchronize(String P, String Q) {
        // If lengths are not equal, synchronization is impossible
        if (P.length() != Q.length()) {
            return -1;
        }

        // Calculate the differences for each character
        int n = P.length();
        int[] diff = new int[n];

        for (int i = 0; i < n; i++) {
            diff[i] = Q.charAt(i) - P.charAt(i);
            if (diff[i] < 0) {
                return -1; // Negative differences are invalid (no "decrement" allowed)
            }
        }

        // Check if all characters with the same character in P have the same difference in Q
        Map<Character, Integer> diffMap = new HashMap<>();

        for (int i = 0; i < n; i++) {
            char ch = P.charAt(i);
            int d = diff[i];

            if (diffMap.containsKey(ch)) {
                if (diffMap.get(ch) != d) {
                    return -1; // Mismatched difference for the same character
                }
            } else {
                diffMap.put(ch, d);
            }
        }

        return 1; // Synchronization is possible
    }
}
