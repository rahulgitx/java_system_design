package tiktaktoe;

import lombok.Getter;
import lombok.Setter;
import tiktaktoe.model.Board;
import tiktaktoe.model.Piece;
import tiktaktoe.model.PieceType;
import tiktaktoe.model.Player;
import tiktaktoe.service.InputService;

import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;

@Setter
@Getter
public class Game {
    private int playersCount;
    int[][] colsOwned;
    int[][] rowsOwned;
    int[][] diagonals;
    int m;
    int n;
    private Board board;
    Deque<Player> dq;

    Scanner sc = new Scanner(System.in);
    public Game(){
        takeInput();

        this.playersCount = dq.size();
        this.m = board.getM();
        this.n = board.getN();
        colsOwned = new int[n][playersCount];
        rowsOwned = new int[m][playersCount];
        diagonals = new int[2][playersCount];

    }
    public void startoff(){
        boolean isWinner = false;
        board.displayBoard();
        while(!isWinner){
            Player currPlayer = dq.pollFirst();

            System.out.println("Please enter the cell location player " + currPlayer.getPlayerId() +
            " for piece " + currPlayer.getPieceAssigned().getPieceType());
            int i = sc.nextInt();
            int j = sc.nextInt();

            boolean inserted = board.insert(i,j, currPlayer.getPieceAssigned());
            if(!inserted){
                System.out.println("The cell is already occupied please choose again");
                dq.addFirst(currPlayer);
                continue;
            }
            if(winningMove(i, j, currPlayer.getPlayerId())){
                board.displayBoard();
                System.out.println("Player " + currPlayer.getPlayerId() + " won the game!!");
                return;
            }

            dq.addLast(currPlayer);
            board.displayBoard();

        }

        System.out.println("Its a tie !!");
    }
    private boolean winningMove(int i, int j, int player){
        rowsOwned[i][player]++;
        if(rowsOwned[i][player] == m) return true;
        colsOwned[j][player]++;
        if(colsOwned[j][player] == n) return true;

        if(m==n && i==j){
            diagonals[0][player]++;
            if(diagonals[0][player] == Math.max(n,m)) return true;
        }
        if(m==n && i+j == n-1){
            diagonals[1][player]++;
            if(diagonals[1][player] == Math.max(n,m)) return true;
        }
        return false;
    }
    private void takeInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Tik Tak Toe");
        System.out.println("Quick game : a");
        System.out.println("Custom game : b");

        this.dq = new LinkedList<>();
        String c = sc.next();
        if(c.charAt(0) == 'a'){
            this.m=3; this.n = 3;
            this.board = new Board(m,n);
            dq.add(new Player(0, new Piece('0')));
            dq.add(new Player(1, new Piece('X')));

        }
        else{
            System.out.println("This option is in progress...");
            System.out.println("Enter no of players");
            HashSet<Character> pieces = new HashSet<>();
            int p = sc.nextInt();
            int t = p;
            while(t>0){
                System.out.println("Enter piece for player " + (p-t));
                String s = sc.next();
                if(pieces.contains(s.charAt(0))){
                    System.out.println("This piece has been taken please choose another one");
                    continue;
                }
                pieces.add(s.charAt(0));
                dq.add(new Player(p-t, new Piece(s.charAt(0))));
                t--;
            }
            System.out.println("Enter dimensions of grid in (a b) form");
            this.m = sc.nextInt();
            this.n = sc.nextInt();
            this.board = new Board(this.m,this.n);
        }


    }
}
