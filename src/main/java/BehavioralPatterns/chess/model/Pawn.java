package main.java.BehavioralPatterns.chess.model;

import static java.lang.Math.abs;

public class Pawn extends PlayingPiece{
    public Pawn(int x, int y, PieceType pieceType, PieceColor pieceColor) {
        super(x, y, pieceType, pieceColor);
    }

    @Override
    public boolean isValidMove(int x, int y) {
        if (this.pieceColor == PieceColor.BLACK){
            return (this.x - x) == 1 && abs(this.y - y) <= 1;
        }
        else{
            return (x-this.x) == 1 && abs(this.y - y) <= 1;
        }
    }
}
