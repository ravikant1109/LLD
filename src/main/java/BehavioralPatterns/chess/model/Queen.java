package main.java.BehavioralPatterns.chess.model;

import static java.lang.Math.abs;

public class Queen extends Piece {
    public Queen(PieceType pieceType, PieceColor pieceColor) {
        super(pieceType, pieceColor);
    }

    @Override
    public boolean isValidMove(int curX, int curY, int x, int y) {
        return (curX - x) == 0 || (curY - y) == 0 || (abs(curX - x ) == abs(curY - y));
    }
}
