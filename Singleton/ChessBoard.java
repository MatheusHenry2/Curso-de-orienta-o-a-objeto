package Singleton;

public class ChessBoard {

    static private ChessBoard instance = new ChessBoard();

    private ChessBoard(){}
    static ChessBoard getInstance(){
        return instance;
    }

    public static void main (String arg[]){
        ChessBoard tabuleiro = ChessBoard.getInstance();
    }
}
