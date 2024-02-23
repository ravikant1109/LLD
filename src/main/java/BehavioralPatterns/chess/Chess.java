package main.java.BehavioralPatterns.chess;

import main.java.BehavioralPatterns.chess.model.Board;
import main.java.BehavioralPatterns.chess.model.PieceType;
import main.java.BehavioralPatterns.chess.model.Player;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Chess {

    Board chessBoard;
    Deque<Player> players;
    public Chess(){
        chessBoard = new Board();
        players = new LinkedList<>();
    }

    public void addPlayers(Player player){
        this.players.add(player);
    }

    public void playChess(){

        while(true){
            chessBoard.printBoard();
            Player curPlayer = players.removeFirst();
            System.out.println(curPlayer.getName() + ": Please enter your current move in this format-" +
                    " (curX, curY, tarX, tarY)");
            String[] coordinates = (new Scanner(System.in)).nextLine().split(",");

            if (coordinates.length != 4) {
                System.out.println("wrong input, allowed number of coordinates are 4. please try again!!");
                players.addFirst(curPlayer);
                continue;
            }

            int curX = Integer.parseInt(coordinates[0]);
            int curY = Integer.parseInt(coordinates[1]);
            int tarX = Integer.parseInt(coordinates[2]);
            int tarY = Integer.parseInt(coordinates[3]);
            if (curX >= 8 || curY >= 8 || curX < 0 || curY < 0 ||tarX >= 8 || tarY >= 8 || tarX < 0 || tarY < 0 ) {
                System.out.println("wrong input, coordinates are smaller/greater than size of board. please try again!!");
                players.addFirst(curPlayer);
                continue;
            }
            if(chessBoard.board[curX][curY].getPieceColor() != curPlayer.getPieceColor()){
                System.out.println("Invalid move, please move correct piece color: " + curPlayer.getPieceColor());
                players.addFirst(curPlayer);
                continue;
            }
            if(! chessBoard.isValid(curX, curY,tarX, tarY, curPlayer.getPieceColor())){
                System.out.println("Invalid move, please try again!!");
                players.addFirst(curPlayer);
                continue;
            }
            chessBoard.move(curX, curY, tarX, tarY);
            if(checkWinner(players.getFirst())){
                System.out.println(curPlayer.getName() + " is the winner of the game");
                return;
            }
            players.add(curPlayer);

        }

    }

    public boolean checkWinner(Player player){
        for(int i = 0; i < 8; i++){
            for( int j = 0; j < 8 ; j++){
                if (chessBoard.board[i][j] != null && chessBoard.board[i][j].getPieceType()  == PieceType.KING
                        && chessBoard.board[i][j].getPieceColor() == player.getPieceColor()){
                    return false;
                }
            }
        }
        return true;
    }

}
