package main.java.BehavioralPatterns.chess.model;

public class Board {
    public  PlayingPiece [][] board;

    public Board(){
        board = new PlayingPiece[8][8];
        initBoard();
    }

    private void initBoard(){

        for(int i = 0 ; i <8; i++){
            board[1][i] = new Pawn(1,i,PieceType.PAWN, PieceColor.WHITE);
            board[6][i] = new Pawn(6,i,PieceType.PAWN, PieceColor.BLACK);
        }
        board[0][0] = new Rook(0,0,PieceType.ROOK, PieceColor.WHITE);
        board[0][7] = new Rook(0,7,PieceType.ROOK, PieceColor.WHITE);
        board[7][0] = new Rook(7,0,PieceType.ROOK, PieceColor.BLACK);
        board[7][7] = new Rook(7,7,PieceType.ROOK, PieceColor.BLACK);
        board[0][1] = new Knight(0,1,PieceType.KNIGHT, PieceColor.WHITE);
        board[0][6] = new Knight(0,6,PieceType.KNIGHT, PieceColor.WHITE);
        board[7][1] = new Knight(7,1,PieceType.KNIGHT, PieceColor.BLACK);
        board[7][6] = new Knight(7,6,PieceType.KNIGHT, PieceColor.BLACK);
        board[0][2] = new Bishop(0,2,PieceType.BISHOP, PieceColor.WHITE);
        board[0][5] = new Bishop(0,5,PieceType.BISHOP, PieceColor.WHITE);
        board[7][2] = new Bishop(7,2,PieceType.BISHOP, PieceColor.BLACK);
        board[7][5] = new Bishop(7,5,PieceType.BISHOP, PieceColor.BLACK);
        board[0][3] = new King(0,3,PieceType.KING, PieceColor.WHITE);
        board[7][3] = new King(7,3,PieceType.KING, PieceColor.BLACK);
        board[0][4] = new Queen(0,4,PieceType.QUEEN, PieceColor.WHITE);
        board[7][4] = new Queen(7,4,PieceType.QUEEN, PieceColor.BLACK);
    }

    public boolean isValid(int curX, int curY, int tarX, int tarY, PieceColor pieceColor){
        return board[curX][curY].isValidMove(tarX, tarY) && (board[tarX][tarY] == null ||
                this.board[tarX][tarY].getPieceColor() != pieceColor );
    }

    public void move(int curX, int curY, int tarX, int tarY){
        board[curX][curY].setX(tarX);
        board[curX][curY].setY(tarY);
        board[tarX][tarY] = board[curX][curY];
        board[curX][curY] = null;
    }

    public void printBoard(){

        for(int i = 0 ; i < 8; i++){
            for( int j = 0 ; j < 8 ; j ++){
                if(board[i][j] == null) {
                    System.out.print("{  <" + i + ","+j+">   }    ");
                }else {
                    if (board[i][j].pieceType == PieceType.PAWN && board[i][j].pieceColor == PieceColor.BLACK) {
                        System.out.print("[_PAWN_]<" + i + ","+j+">   ");
                    }
                    else if (board[i][j].pieceType == PieceType.PAWN && board[i][j].pieceColor == PieceColor.WHITE) {
                        System.out.print("(_PAWN_)<" + i + ","+j+">   ");
                    }
                    else if (board[i][j].pieceType == PieceType.BISHOP && board[i][j].pieceColor == PieceColor.BLACK) {
                        System.out.print("[BISHOP]<" + i + ","+j+">   ");
                    }
                    else if (board[i][j].pieceType == PieceType.BISHOP && board[i][j].pieceColor == PieceColor.WHITE) {
                        System.out.print("(BISHOP)<" + i + ","+j+">   ");
                    }
                    else if (board[i][j].pieceType == PieceType.KING && board[i][j].pieceColor == PieceColor.BLACK) {
                        System.out.print("[_KING_]<" + i + ","+j+">   ");
                    }
                    else if (board[i][j].pieceType == PieceType.KING && board[i][j].pieceColor == PieceColor.WHITE) {
                        System.out.print("(_KING_)<" + i + ","+j+">   ");
                    }
                    else if (board[i][j].pieceType == PieceType.KNIGHT && board[i][j].pieceColor == PieceColor.BLACK) {
                        System.out.print("[KNIGHT]<" + i + ","+j+">   ");
                    }
                    else if (board[i][j].pieceType == PieceType.KNIGHT && board[i][j].pieceColor == PieceColor.WHITE) {
                        System.out.print("(KNIGHT)<" + i + ","+j+">   ");
                    }else if (board[i][j].pieceType == PieceType.ROOK && board[i][j].pieceColor == PieceColor.BLACK) {
                        System.out.print("[_ROOK_]<" + i + ","+j+">   ");
                    }else if (board[i][j].pieceType == PieceType.ROOK && board[i][j].pieceColor == PieceColor.WHITE) {
                        System.out.print("(_ROOK_)<" + i + ","+j+">   ");
                    }
                    else if (board[i][j].pieceType == PieceType.QUEEN && board[i][j].pieceColor == PieceColor.BLACK) {
                        System.out.print("[QUEEN_]<" + i + ","+j+">   ");
                    }
                    else if (board[i][j].pieceType == PieceType.QUEEN && board[i][j].pieceColor == PieceColor.WHITE) {
                        System.out.print("(QUEEN_)<" + i + ","+j+">   ");

                    }


                }
            }
            System.out.print("\n");
        }
    }
}
