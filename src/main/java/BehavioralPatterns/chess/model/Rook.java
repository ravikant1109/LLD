package main.java.BehavioralPatterns.chess.model;

public class Rook extends PlayingPiece{
    public Rook(int x, int y, PieceType pieceType, PieceColor pieceColor) {
        super(x, y, pieceType, pieceColor);
    }

    @Override
    public boolean isValidMove(int x, int y) {
        return (this.x - x == 0) || (this.y - y == 0);
    }

}
