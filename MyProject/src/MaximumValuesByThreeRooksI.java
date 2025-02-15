import java.util.*;

public class MaximumValuesByThreeRooksI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();

        int[][] board = new int[m][n];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                board[i][j] = scanner.nextInt();
            }
        }
        SolutionMaxValuesByThreeRooksI solution = new SolutionMaxValuesByThreeRooksI();
        long res = solution.maximumValueSum(board);
        System.out.println(res);
    }
}
class SolutionMaxValuesByThreeRooksI {
    int m, n;
    void func(int[][] board, Long sum, int x, int y, List<Long[]> summ){
        int index = x*n + y;
        for(int i=0; i<m; i++){
            for(int j=0;j<n; j++){
//                index += i*n + j;
//                summ[index][0] = sum + board[i][j];
//                summ[index][1] = (long)x;
//                summ[index][2] = (long)y;
//                summ[index][3] = (long)i;
//                summ[index][4] = (long)j;
                 summ.add(new Long[]{sum + board[i][j], (long)x, (long)y, (long)i, (long)j});
            }
        }
    }
    public long maximumValueSum(int[][] board) {
        this.m = board.length;
        this.n = board[0].length;
        Integer[][] arr = new Integer[m*n][3];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                arr[i*n + j][0] = board[i][j];
                arr[i*n + j][1] = i;
                arr[i*n + j][2] = j;
            }
        }

        Comparator<Integer[]> comp = (a, b) -> {
            if(a[0] < b[0]) return 1;
            return -1;
        };
        Arrays.sort(arr, comp);

//        Long[][] summ = new Long[m*n*m*n][5];
         List<Long[]> summ = new ArrayList<>();
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                Long sum = (long)board[i][j];
                func(board, sum, i,j, summ);
            }
        }
//        Integer.MIN_VALUE
        Comparator<Long[]> comp2 = (a, b) -> {
            if(a[0] < b[0]) return 1;
//            else if(a[0].equals(b[0])) return 0;
            return -1;
        };
//        Arrays.sort(summ, comp2);
         summ.sort(comp2);

        // for(int i=0; i<arr.length; i++){
        //     System.out.println(arr[i][0]);
        // }

        long res = 0;

        for(int i=0; i<arr.length; i++){
            int val = arr[i][0], r = arr[i][1], c = arr[i][2];
            int second =  Integer.MIN_VALUE, third =  Integer.MIN_VALUE;
            int j = 0;

            while(j<summ.size()){
//                long secr = summ[j][1], secc = summ[j][2], thirdr = summ[j][3], thirdc = summ[j][4];
                long secr = summ.get(j)[1], secc = summ.get(j)[2], thirdr = summ.get(j)[3], thirdc = summ.get(j)[4];
                if(secr == r || thirdr == r || secc == c || thirdc == c){
                    j++; continue;
                }
                res = Math.max(res, val + summ.get(j)[0]);
                break;
            }

            // int secr = -1, secc = -1;
            // while(j<arr.length){
            //     if(arr[j][1] == r || arr[j][2] == c){
            //         j++; continue;
            //     }
            //     second = arr[j][0];
            //     secr = arr[j][1]; secc = arr[j][2];
            //     j++;
            //     break;
            // }
            // while(j<arr.length){
            //     if(arr[j][1] ==r || arr[j][1] == secr ||
            //        arr[j][2] == c || arr[j][2] == secc){
            //         j++; continue;
            //     }
            //     third = arr[j][0];
            //     break;
            // }

            // if(second !=  Integer.MIN_VALUE && third !=  Integer.MIN_VALUE){
            //     System.out.println(val + " " + second + " " + third + " " + (val + second + third));
            //     res = Math.max(val + second + third, res);
            // }
        }
        return res;
    }
}

/*
3 3
1 2 3
3 4 2
5 2 4
 */

/*
3 4
-3 1 1 1
-3 1 -3 1
-3 2 1 1
 */