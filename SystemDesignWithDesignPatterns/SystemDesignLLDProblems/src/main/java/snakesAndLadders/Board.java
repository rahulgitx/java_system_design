package snakesAndLadders;

import lombok.Getter;
import lombok.Setter;

import java.util.concurrent.ThreadLocalRandom;

@Setter
@Getter
public class Board {
    private Cell[][] board;
    private int r;
    private int c;
    Board(int m, int n, int snakes, int ladders){
        this.r = m;
        this.c = n;
        board = new Cell[m][n];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                board[i][j] = new Cell(i,j);
            }
        }
        addSnakes(snakes);
        addLadders(ladders);
    }
    void addSnakes(int snakesCount){
        while(snakesCount>0){
            int mouth = ThreadLocalRandom.current().nextInt(2,r*r);
            int tail = ThreadLocalRandom.current().nextInt(1,mouth);
            int rCell = mouth/c;
            int cCell = mouth%c;
            if(board[rCell][cCell].getJump() != 0) continue;
            board[rCell][cCell].setJump(tail-mouth);
            System.out.println("Snake added with mouth at " + mouth + " and tail at " + tail);
            snakesCount--;
        }
    }
    void addLadders(int laddersCount){
        while(laddersCount>0){
            int base = ThreadLocalRandom.current().nextInt(1,r*r-1);
            int top = ThreadLocalRandom.current().nextInt(base+1,r*r);

            int rCell = base/c;
            int cCell = base%c;
            if(board[rCell][cCell].getJump() != 0) continue;

            board[rCell][cCell].setJump(top-base);
            System.out.println("Ladder added with base at " + base + " and top at " + top);
            laddersCount--;
        }
    }
}
