package main.java.BehavioralPatterns.chess.model;

public class Rook extends Piece {
    public Rook(PieceType pieceType, PieceColor pieceColor) {
        super(pieceType, pieceColor);
    }

    @Override
    public boolean isValidMove(int curX, int curY, int x, int y) {

        return (curX - x == 0) || (curY - y == 0);
    }

}
