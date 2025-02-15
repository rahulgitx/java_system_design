package snakesAndLadders;

import lombok.Getter;
import lombok.Setter;

import java.util.Deque;
import java.util.LinkedList;

@Setter
@Getter
public class SnakesAndLadders {
    private Board board;
    private Deque<Player> deque;
    private Dice dice;
    SnakesAndLadders(){
        this.dice = new Dice(1);
        initializeGame();
        initializePlayer();
    }
    void initializeGame(){
        this.board = new Board(10,10,4,4);
    }
    void initializePlayer(){
        this.deque = new LinkedList<>();
        for(int i=0; i<4; i++){
            Player player = new Player(i+1, this.board.getBoard()[0][0]);
            this.deque.addLast(player);
        }
    }

    void startGame(){
//        boolean noWinner = true;
        while(true){
            Player currPlayer = deque.pollFirst();
            System.out.println();
            System.out.println(currPlayer.getPlayerNo() + " player's turn. Current position " + currPlayer.getPlayerPosition().getRow() + ":" + currPlayer.getPlayerPosition().getColumn());
            System.out.println("Rolling dice...");
            int dicejump = dice.rollDice();

            int newJumpCellNo = dicejump + getCurrCellNo(currPlayer.getPlayerPosition());
            int r = newJumpCellNo/this.board.getC();
            int c = newJumpCellNo%this.board.getC();
            System.out.println("New Position: " + r + ":" + c);
            if(newJumpCellNo >= 100){
                System.out.println("Player " + currPlayer.getPlayerNo() + " won the game!!!!");
                break;
            }

            if(board.getBoard()[r][c].getJump() > 0){
                System.out.println("Landed at ladder!!!");
            }
            else if(board.getBoard()[r][c].getJump() < 0){
                System.out.println("Oopss!!! Got bit by Snake :((");
            }
            newJumpCellNo += board.getBoard()[r][c].getJump();

            r = newJumpCellNo/this.board.getC();
            c = newJumpCellNo%this.board.getC();

            currPlayer.setPlayerPosition(this.board.getBoard()[r][c]);
            System.out.println("Final Position: " + r + ":" + c);

            deque.addLast(currPlayer);
        }
    }
    int getCurrCellNo(Cell cell){
        return cell.getRow()*this.getBoard().getC() + cell.getColumn();
    }
}
