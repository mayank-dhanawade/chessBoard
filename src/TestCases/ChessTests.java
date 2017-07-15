package TestCases;

import ChessBoardMain.ChessMain;
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
            boolean isValid = pieceTypeValidation.valdiatePiece(piece);
            assertEquals(true,isValid);
        }

    }

    @Test
    public void PiecePositionShouldBeValid(){
        ChessMain piecePositionValidation = new ChessMain();
        boolean isValid = piecePositionValidation.validatePosition();
        assertEquals(true,isValid);
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
