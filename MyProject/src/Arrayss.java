

import accessmodifiers.C;

import java.util.Scanner;

public class Arrayss {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        C c = new C();
        long n = scanner.nextLong();
//        int n = scanner.nextInt();

        // in java arrays are given size dynamically
//        int[] arr = new int[n];


        // for(int i:arr) -> here i is just a copy of arr[i]
//        for(int i:arr) i++;
//        for(int i : arr) {
//            System.out.print(i + " ");
//        }
        int[][][] directions = new int[5][][];
        directions[0] = new int[][]{{-1,0},{0,1},{1,0},{0,-1}};
        directions[1] = new int[][]{{0,-1},{-1,0}};// top left
        directions[2] = new int[][]{{-1,0},{0,1}}; // top right
        directions[3] = new int[][]{{0,1},{1,0}}; // bottom left
        directions[4] = new int[][]{{1,0},{0,-1}}; // bottom right
        String s  = "\\";
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '\\'){
                System.out.println("found");
            }
            System.out.println(s.charAt(i));
        }
//        System.out.println(s.length());

        Long[][] longarr = new Long[2][2];
        for(int i=0; i<2; i++){
            for(int j=0; j<2; j++){
                System.out.println(longarr[i][j]);
            }
        }
//        C class = new C();
    }
}
