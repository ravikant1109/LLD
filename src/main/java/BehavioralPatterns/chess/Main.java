package main.java.BehavioralPatterns.chess;


import main.java.BehavioralPatterns.chess.model.PieceColor;
import main.java.BehavioralPatterns.chess.model.Player;

public class Main {
    public static void main(String[] args) {
        Chess chess = new Chess();
        Player player1 = new Player("Ravi", PieceColor.WHITE);
        Player player2 = new Player("Aman", PieceColor.BLACK);
        chess.addPlayers(player1);
        chess.addPlayers(player2);
        chess.playChess();
    }
}
