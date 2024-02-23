package main.java.BehavioralPatterns.chess.model;

import static java.lang.Math.abs;

public class Bishop extends PlayingPiece{
    public Bishop(int x, int y, PieceType pieceType, PieceColor pieceColor) {
        super(x, y, pieceType, pieceColor);
    }

    @Override
    public boolean isValidMove(int x, int y) {
        return  (abs(this.x - x ) == abs(this.y - y));
    }
}
