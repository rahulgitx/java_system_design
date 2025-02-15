package snakesAndLadders;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Player {
    private int playerNo;
    private Cell playerPosition;
    Player(int n, Cell cell){
        this.playerNo = n;
        this.playerPosition = cell;
    }
}
