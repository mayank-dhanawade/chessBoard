package ChessBoardMain;

/**
 * Created by mayank on 15/7/17.
 */
public class ChessMain {
    String piecePosition;

    public ChessMain(){

    }

    public ChessMain(String piecePosition) {
        this.piecePosition = piecePosition;
    }

    public static void main(String[] args) {
        for (PieceEnum p : PieceEnum.values()) {
            if (p.name().equalsIgnoreCase("king"))
                System.out.println("true");

        }
    }

    public boolean valdiatePiece(){
        return false;
    }

    public boolean validatePosition(){
        return false;
    }

}
