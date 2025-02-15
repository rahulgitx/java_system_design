import java.util.Scanner;

public class FindCountOfMonotonicPairsII {
    public static int countOfPairs(int[] nums){
        int n = nums.length;
        long[][] dp = new long[n][51];

        dp[n-1][0] = 1;
        for(int i=1; i<=nums[n-1]; i++){
            dp[n-1][i] = dp[n-1][i-1]+1;
        }
        long m = 1000000007l;

        long res = 0;
        for(int i=n-2; i>=0; i--){

            for(int j=0; j<=nums[i]; j++){
                long temp = 0;
                int start = Math.max(nums[i+1]-(nums[i]-j), j);
                long startSum = start>0 ? dp[i+1][start-1] : 0;
                int end = nums[i+1];


                temp = dp[i+1][end] - startSum;
                // if(j>0 && temp > 0) temp = (temp%m + dp[i][j-1]%m)%m;

                // for(int k=j; k<=nums[i+1]; k++){
                //     if(nums[i+1]-k <= nums[i]-j){
                //         temp = (temp%m + dp[i+1][k]%m)%m;
                //     }
                // }
                dp[i][j] = temp;

            }
        }
        for(int j=0; j<=nums[0]; j++){
            // res += dp[0][j];
            res = (res%m + dp[0][j]%m)%m;
        }
//        for(int i=0; i<n; i++){
//            for(int j=0; j<10; j++){
//                System.out.print(dp[i][j] + " ");
//            }
//            System.out.println();
//        }
        System.out.println(res);
        return (int)res;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] nums = new int[n];
        for(int i=0; i<n; i++){
            nums[i] = scanner.nextInt();
        }

        System.out.println(countOfPairs(nums));
    }
}

/*
3
2 3 2
 */
