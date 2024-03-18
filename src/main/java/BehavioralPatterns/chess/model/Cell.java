package main.java.BehavioralPatterns.chess.model;

public class Cell {
    int x;
    int y;
    Piece piece;

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

    public Piece getPiece() {
        return piece;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }

    public Cell(int x, int y, Piece piece){
        this.x = x;
        this.y = y;
        this.piece = piece;
    }

    public boolean isValidMove(int curX, int curY){
        return this.piece.isValidMove(this.x, this.y, curX, curY);
    }
}
