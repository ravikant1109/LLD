package main.java.BehavioralPatterns.chess.model;

import static java.lang.Math.abs;

public class King extends PlayingPiece{
    public King(int x, int y, PieceType pieceType, PieceColor pieceColor) {
        super(x, y, pieceType, pieceColor);
    }

    @Override
    public boolean isValidMove(int x, int y) {
        return abs(this.x - x) <= 1 && abs(this.y - y) <= 1;
    }
}
