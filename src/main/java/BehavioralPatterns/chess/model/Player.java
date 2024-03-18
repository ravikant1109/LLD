package main.java.BehavioralPatterns.chess.model;

public class Player {
    String name;
    PieceColor pieceColor;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PieceColor getPieceColor() {
        return pieceColor;
    }

    public void setPieceColor(PieceColor pieceColor) {
        this.pieceColor = pieceColor;
    }

    public Player(String name, PieceColor pieceColor){
        this.name = name;
        this.pieceColor = pieceColor;
    }
}
