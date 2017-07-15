package TestCases;

import ChessBoardMain.ChessMain;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by mayank on 15/7/17.
 */
public class ChessTests {

    @Test
    public void PieceTypeShouldBeValid(){
        ChessMain pieceTypeValidation = new ChessMain();
        boolean isValid = pieceTypeValidation.valdiatePiece();
        assertEquals(true,isValid);
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
