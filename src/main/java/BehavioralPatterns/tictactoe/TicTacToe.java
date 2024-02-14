package main.java.BehavioralPatterns.tictactoe;

import main.java.BehavioralPatterns.tictactoe.model.*;

import java.sql.SQLOutput;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class TicTacToe {

    Board board;
    Deque<Player> players;
    public TicTacToe(int size){
        init(size);
    }

    private void init(int size){

        players = new LinkedList<>();
        board = new Board(size);
        Player player1 = new Player("Ravi", new PlayingPieceX());
        Player player2 = new Player("Kant", new PlayingPieceO());
        players.add(player1);
        players.add(player2);
    }

    public String playGame(){
        System.out.println("Enter your move in form of coordinates x, y in range" + board.size);

        while (board.leftOver != 0) {
            board.printBoard();
            Player curPlayer = players.removeFirst();
            System.out.println("Enter your move: " + curPlayer.getName());

            String[] coordinates = (new Scanner(System.in)).nextLine().split(",");
            if (coordinates.length != 2) {
                System.out.println("wrong input, allowed number of coordinates are 2. please try again!!");
                players.addFirst(curPlayer);
                continue;
            }

            int moveX = Integer.parseInt(coordinates[0]);
            int moveY = Integer.parseInt(coordinates[1]);
            if (moveX >= board.size || moveY >= board.size) {
                System.out.println("wrong input, coordinates are greater than size of board. please try again!!");
                players.addFirst(curPlayer);
                continue;
            }
            if (!board.addPiece(moveX, moveY, curPlayer.getPlayingPiece())) {
                System.out.println("This coordinate is already occupied, please try again");
                players.addFirst(curPlayer);
                continue;
            }
            if (board.checkWinner(curPlayer, moveX, moveY)) {

                return curPlayer.getName();
            }
            players.add(curPlayer);
        }
        return "None";
    }


}
