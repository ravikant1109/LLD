package main.java.BehavioralPatterns.chess.model;

import static java.lang.Math.abs;

public class Knight extends PlayingPiece{
    public Knight(int x, int y, PieceType pieceType, PieceColor pieceColor) {
        super(x, y, pieceType, pieceColor);
    }

    @Override
    public boolean isValidMove(int x, int y) {
        return (abs(this.x - x) == 1 && abs(this.y - y) == 2) || (abs(this.x - x) == 2 && abs(this.y - y) == 1);
    }

}
