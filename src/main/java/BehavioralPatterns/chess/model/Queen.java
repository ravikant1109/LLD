package main.java.BehavioralPatterns.chess.model;

import static java.lang.Math.abs;

public class Queen extends PlayingPiece{
    public Queen(int x, int y, PieceType pieceType, PieceColor pieceColor) {
        super(x, y, pieceType, pieceColor);
    }

    @Override
    public boolean isValidMove(int x, int y) {
        return (this.x - x) == 0 || (this.y - y) == 0 || (abs(this.x - x ) == abs(this.y - y));
    }
}
