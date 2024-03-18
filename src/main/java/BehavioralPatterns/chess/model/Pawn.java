package main.java.BehavioralPatterns.chess.model;

import static java.lang.Math.abs;

public class Pawn extends Piece {
    public Pawn( PieceType pieceType, PieceColor pieceColor) {
        super(pieceType, pieceColor);
    }

    @Override
    public boolean isValidMove(int curX, int curY, int x, int y) {
        if (this.pieceColor == PieceColor.BLACK){
            return (curX - x) == 1 && abs(curY - y) <= 1;
        }
        else{
            return (x-curX) == 1 && abs(curY - y) <= 1;
        }
    }
}
