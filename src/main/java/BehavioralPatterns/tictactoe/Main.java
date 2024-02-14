package main.java.BehavioralPatterns.tictactoe;

public class Main {
    public static void main(String[] args) {
        TicTacToe ticTacToe = new TicTacToe(3);
        System.out.println("Winner of the game is " + ticTacToe.playGame());
    }
}
