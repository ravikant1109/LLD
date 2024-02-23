package main.java.BehavioralPatterns.chess.model;

public abstract class PlayingPiece {
    PieceType pieceType;
    PieceColor pieceColor;

    int x;
    int y;
    public PlayingPiece(int x, int y, PieceType pieceType, PieceColor pieceColor){
        this.pieceColor = pieceColor;
        this.pieceType = pieceType;
        this.x = x;
        this.y = y;
    }
    public abstract boolean isValidMove(int x, int y);


    public PieceColor getPieceColor() {
        return pieceColor;
    }

    public void setPieceColor(PieceColor pieceColor) {
        this.pieceColor = pieceColor;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public PieceType getPieceType() {
        return pieceType;
    }

    public void setPieceType(PieceType pieceType) {
        this.pieceType = pieceType;
    }
}
