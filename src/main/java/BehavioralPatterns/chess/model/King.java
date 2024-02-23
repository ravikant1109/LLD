package main.java.BehavioralPatterns.chess.model;

import static java.lang.Math.abs;

public class King extends Piece {
    public King(PieceType pieceType, PieceColor pieceColor) {
        super(pieceType, pieceColor);
    }

    @Override
    public boolean isValidMove(int curX, int curY, int x, int y) {
        return abs(curX - x) <= 1 && abs(curY - y) <= 1;
    }
}
