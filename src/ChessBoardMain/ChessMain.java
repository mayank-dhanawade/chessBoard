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


    public boolean valdiatePiece(String piece){
        for (PieceEnum p : PieceEnum.values()) {
            if (p.name().equalsIgnoreCase(piece))
                return true;

        }
        return false;
    }

    public boolean validatePosition(){
        return false;
    }

}
