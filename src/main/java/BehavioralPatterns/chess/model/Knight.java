package main.java.BehavioralPatterns.chess.model;

import static java.lang.Math.abs;

public class Knight extends Piece {
    public Knight(PieceType pieceType, PieceColor pieceColor) {
        super(pieceType, pieceColor);
    }

    @Override
    public boolean isValidMove(int curX, int curY, int x, int y) {
        return (abs(curX - x) == 1 && abs(curY - y) == 2) || (abs(curX - x) == 2
                && abs(curY - y) == 1);
    }

}
