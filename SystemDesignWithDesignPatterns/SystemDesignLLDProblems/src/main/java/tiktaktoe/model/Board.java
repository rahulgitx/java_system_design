package tiktaktoe.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Board {
    int m;
    int n;
    private Piece[][] board;

    public Board(int m, int n){
        this.m = m;
        this.n = n;
        board = new Piece[m][n];
    }

    public void displayBoard(){
        for(int i=0; i<m; i++){
            System.out.print("|");
            for(int j=0; j<n; j++) {
                if(board[i][j] == null) System.out.print(" _ |");
                else System.out.print(" " + board[i][j].getPieceType() + " |");
            }
            System.out.println();
        }
//        System.out.println();
    }
    public Boolean insert(int m, int n, Piece piece){
        if(board[m][n] != null) return false;
        board[m][n] = piece;
        return true;
    }

}
