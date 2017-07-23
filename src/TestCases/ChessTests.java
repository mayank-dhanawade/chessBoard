package TestCases;

import ChessBoardMain.ChessMain;
import ChessBoardMain.Spot;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by mayank on 15/7/17.
 */
public class ChessTests {

    private String[] pieces = {"king","queen","bishop","horse","rook","pawn"};

    @Test
    public void PieceTypeShouldBeValid(){
        for (String piece: pieces){
            ChessMain pieceTypeValidation = new ChessMain();
            pieceTypeValidation.valdiatePiece(piece);
        }

    }

    @Test
    public void PiecePositionShouldBeValid(){
        ChessMain piecePositionValidation = new ChessMain();
        Spot spot = piecePositionValidation.validatePosition("A4");

    }

    @Test
    public void runTests(){
        ChessMain pieceAndPosition = new ChessMain();
        boolean isValid = pieceAndPosition.testRunner("KING D5");
    }

    @Test
    public void CheckIfPossibleOutputsFitInTheMatrix(){

    }

    @Test
    public void CheckPossibleOutputsWithSampleOutputs(){

    }

    @Test
    public void GenerateRandomPiecesAndPositionsToCheckIfDifferentOutputsAreAvailable(){

    }

}
