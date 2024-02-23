package main.java.BehavioralPatterns.chess.model;

public abstract class Piece {
    PieceType pieceType;
    PieceColor pieceColor;

    public Piece(PieceType pieceType, PieceColor pieceColor){
        this.pieceColor = pieceColor;
        this.pieceType = pieceType;

    }
    public abstract boolean isValidMove(int curX, int curY, int x, int y);


    public PieceColor getPieceColor() {
        return pieceColor;
    }

    public void setPieceColor(PieceColor pieceColor) {
        this.pieceColor = pieceColor;
    }


    public PieceType getPieceType() {
        return pieceType;
    }

    public void setPieceType(PieceType pieceType) {
        this.pieceType = pieceType;
    }
}
