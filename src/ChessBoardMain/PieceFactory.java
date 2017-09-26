package ChessBoardMain;

/**
 * Created by mayank on 23/7/17.
 */
public class PieceFactory {

    public ChessPiece getChessPiece(PieceEnum pieceEnum){
        System.out.println(pieceEnum.toString());
        switch (pieceEnum.toString()){
            case "KING" : return new King();
        }
    return null;
    }
}
