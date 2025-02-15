package tiktaktoe.model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Player {
    private int playerId;
    private Piece pieceAssigned;
    public Player(int id, Piece piece){
        this.pieceAssigned = piece;
        this.playerId = id;
    }
}
