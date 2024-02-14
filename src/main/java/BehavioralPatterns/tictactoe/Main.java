package main.java.BehavioralPatterns.tictactoe;

import main.java.BehavioralPatterns.tictactoe.model.Player;
import main.java.BehavioralPatterns.tictactoe.model.PlayingPiece;
import main.java.BehavioralPatterns.tictactoe.model.PlayingPieceO;
import main.java.BehavioralPatterns.tictactoe.model.PlayingPieceX;

public class Main {
    public static void main(String[] args) {
        TicTacToe ticTacToe = new TicTacToe(3);
        ticTacToe.addPlayers(new Player("Ravi", new PlayingPieceX()));
        ticTacToe.addPlayers(new Player("Aman", new PlayingPieceO()));
        System.out.println("Winner of the game is " + ticTacToe.playGame());
    }
}
