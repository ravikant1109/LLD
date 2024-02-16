package main.java.BehavioralPatterns.tictactoe.model;

import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Board {

    public int size;
    PlayingPiece[][] board;

    public int leftOver;

    public Board(int size){
        this.size = size;
        this.leftOver = size*size;
        board = new PlayingPiece[size][size];
    }

    public boolean addPiece(int x, int y, PlayingPiece pieceType){
        if (board[x][y] != null){
            return false;
        }
        else{
            board[x][y] = pieceType;
            this.leftOver--;
            return true;
        }
    }

    public List<List<Integer>>  getEmptyCells(){
        List<List<Integer>> emptyCells = new ArrayList<>();


        for(int i = 0; i < this.size; i++){

            for (int j = 0; j < this.size; j++){
                List<Integer> cells = new ArrayList<>();
                if (board[i][j] == null){
                    cells.add(i);
                    cells.add(j);
                }
                if (!cells.isEmpty()){
                    emptyCells.add(cells);
                }
            }
        }
        return emptyCells;
    }

    public void printBoard(){

        for(int i = 0 ; i < this.size; i++){
            for( int j = 0 ; j < this.size ; j ++){
                if(board[i][j] == null) {
                    System.out.print("   ");
                }else {
                    if (board[i][j].pieceType == PieceType.O) {
                        System.out.print(" O ");
                    }
                    else{
                        System.out.print(" X ");
                    }
                }
                if( j != this.size -1){
                    System.out.print("|");
                }
            }
            System.out.print("\n");
        }
    }

    public boolean checkWinner(Player curPlayer, int x, int y){
        PlayingPiece pieceType = curPlayer.getPlayingPiece();

        boolean checkRow = true;
        boolean checkColumn = true;
        boolean checkPrimaryDiagonal = true;
        boolean checkSecondaryDiagonal = true;

        for( int i = 0 ; i < size ; i++){
            if ((board[i][y] == null) || (board[i][y] != pieceType)){
                checkColumn = false;
                break;
            }
        }
        for( int i = 0 ; i < size ; i++){
            if ((board[x][i] == null) || (board[x][i] != pieceType)){
                checkRow = false;
                break;
            }
        }
        for( int i = 0 ; i < size ; i++){
            if ((board[i][i] == null) || (board[i][i] != pieceType)){
                checkPrimaryDiagonal = false;
                break;
            }
        }
        for( int i = size-1, j = 0 ; i >= 0 && j < size ; i--, j++){
            if ((board[i][j] == null) || (board[i][j] != pieceType)){
                checkSecondaryDiagonal = false;
                break;
            }
        }
        return checkColumn || checkRow || checkPrimaryDiagonal || checkSecondaryDiagonal;
    }
}
