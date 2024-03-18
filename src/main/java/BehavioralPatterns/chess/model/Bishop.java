package main.java.BehavioralPatterns.chess.model;

import static java.lang.Math.abs;

public class Bishop extends Piece {
    public Bishop(PieceType pieceType, PieceColor pieceColor) {

        super(pieceType, pieceColor);
    }

    @Override
    public boolean isValidMove(int curX, int curY, int x, int y) {

        return  (abs(curX - x ) == abs(curY - y));
    }
}
