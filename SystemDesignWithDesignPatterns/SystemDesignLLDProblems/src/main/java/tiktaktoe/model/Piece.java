package tiktaktoe.model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Piece {
    private char pieceType;
    public Piece(char pieceType){
        this.pieceType = pieceType;
    }
}
