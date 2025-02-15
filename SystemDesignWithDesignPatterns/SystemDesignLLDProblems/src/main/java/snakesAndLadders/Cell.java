package snakesAndLadders;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Cell {
    private int row;
    private int column;
    private int jump = 0;
    Cell(int i, int j){
        this.row = i;
        this.column = j;
    }
}
