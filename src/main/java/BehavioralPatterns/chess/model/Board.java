package main.java.BehavioralPatterns.chess.model;

public class Board {
    public  Cell[][] board;

    public Board(){
        board = new Cell[8][8];
        initBoard();
    }

    private void initBoard(){

        for(int i = 0 ; i <8; i++){
            board[1][i] = new Cell(1,i,new Pawn(PieceType.PAWN, PieceColor.WHITE));
            board[6][i] = new Cell(6,i,new Pawn(PieceType.PAWN, PieceColor.BLACK));
        }
        board[0][0] = new Cell(0,0,new Rook(PieceType.ROOK, PieceColor.WHITE));
        board[0][7] = new Cell(0,7,new Rook(PieceType.ROOK, PieceColor.WHITE));
        board[7][0] = new Cell(7,0,new Rook(PieceType.ROOK, PieceColor.BLACK));
        board[7][7] = new Cell(7,7,new Rook(PieceType.ROOK, PieceColor.BLACK));
        board[0][1] = new Cell(0,1,new Knight(PieceType.KNIGHT, PieceColor.WHITE));
        board[0][6] = new Cell(0,6,new Knight(PieceType.KNIGHT, PieceColor.WHITE));
        board[7][1] = new Cell(7,1,new Knight(PieceType.KNIGHT, PieceColor.BLACK));
        board[7][6] = new Cell(7,6,new Knight(PieceType.KNIGHT, PieceColor.BLACK));
        board[0][2] = new Cell(0,2,new Bishop(PieceType.BISHOP, PieceColor.WHITE));
        board[0][5] = new Cell(0,5,new Bishop(PieceType.BISHOP, PieceColor.WHITE));
        board[7][2] = new Cell(7,2,new Bishop(PieceType.BISHOP, PieceColor.BLACK));
        board[7][5] = new Cell(7,5,new Bishop(PieceType.BISHOP, PieceColor.BLACK));
        board[0][3] = new Cell(0,3,new King(PieceType.KING, PieceColor.WHITE));
        board[7][3] = new Cell(7,3,new King(PieceType.KING, PieceColor.BLACK));
        board[0][4] = new Cell(0,4,new Queen(PieceType.QUEEN, PieceColor.WHITE));
        board[7][4] = new Cell(7,4,new Queen(PieceType.QUEEN, PieceColor.BLACK));
    }

    public boolean isValid(int curX, int curY, int tarX, int tarY, PieceColor pieceColor){
        return board[curX][curY].isValidMove(tarX, tarY) && (board[tarX][tarY] == null ||
                this.board[tarX][tarY].getPiece().getPieceColor() != pieceColor );
    }

    public void move(int curX, int curY, int tarX, int tarY){
        Cell cell = board[curX][curY];
        cell.setX(tarX);
        cell.setY(tarY);
        board[tarX][tarY] = cell;
        board[curX][curY] = null;
    }


    public void printBoard(){

        for(int i = 0 ; i < 8; i++){
            for( int j = 0 ; j < 8 ; j ++){
                if(board[i][j] == null) {
                    System.out.print("{  <" + i + ","+j+">   }    ");
                }else {
                    if (board[i][j].getPiece().getPieceType() == PieceType.PAWN && board[i][j].getPiece().getPieceColor() == PieceColor.BLACK) {
                        System.out.print("[_PAWN_]<" + i + ","+j+">   ");
                    }
                    else if (board[i][j].getPiece().getPieceType() == PieceType.PAWN && board[i][j].getPiece().getPieceColor() == PieceColor.WHITE) {
                        System.out.print("(_PAWN_)<" + i + ","+j+">   ");
                    }
                    else if (board[i][j].getPiece().getPieceType() == PieceType.BISHOP && board[i][j].getPiece().getPieceColor() == PieceColor.BLACK) {
                        System.out.print("[BISHOP]<" + i + ","+j+">   ");
                    }
                    else if (board[i][j].getPiece().getPieceType() == PieceType.BISHOP && board[i][j].getPiece().getPieceColor() == PieceColor.WHITE) {
                        System.out.print("(BISHOP)<" + i + ","+j+">   ");
                    }
                    else if (board[i][j].getPiece().getPieceType() == PieceType.KING && board[i][j].getPiece().getPieceColor() == PieceColor.BLACK) {
                        System.out.print("[_KING_]<" + i + ","+j+">   ");
                    }
                    else if (board[i][j].getPiece().getPieceType() == PieceType.KING && board[i][j].getPiece().getPieceColor() == PieceColor.WHITE) {
                        System.out.print("(_KING_)<" + i + ","+j+">   ");
                    }
                    else if (board[i][j].getPiece().getPieceType() == PieceType.KNIGHT && board[i][j].getPiece().getPieceColor() == PieceColor.BLACK) {
                        System.out.print("[KNIGHT]<" + i + ","+j+">   ");
                    }
                    else if (board[i][j].getPiece().getPieceType() == PieceType.KNIGHT && board[i][j].getPiece().getPieceColor() == PieceColor.WHITE) {
                        System.out.print("(KNIGHT)<" + i + ","+j+">   ");
                    }else if (board[i][j].getPiece().getPieceType() == PieceType.ROOK && board[i][j].getPiece().getPieceColor() == PieceColor.BLACK) {
                        System.out.print("[_ROOK_]<" + i + ","+j+">   ");
                    }else if (board[i][j].getPiece().getPieceType() == PieceType.ROOK && board[i][j].getPiece().getPieceColor() == PieceColor.WHITE) {
                        System.out.print("(_ROOK_)<" + i + ","+j+">   ");
                    }
                    else if (board[i][j].getPiece().getPieceType() == PieceType.QUEEN && board[i][j].getPiece().getPieceColor() == PieceColor.BLACK) {
                        System.out.print("[QUEEN_]<" + i + ","+j+">   ");
                    }
                    else if (board[i][j].getPiece().getPieceType() == PieceType.QUEEN && board[i][j].getPiece().getPieceColor() == PieceColor.WHITE) {
                        System.out.print("(QUEEN_)<" + i + ","+j+">   ");

                    }


                }
            }
            System.out.print("\n");
        }
    }
}
