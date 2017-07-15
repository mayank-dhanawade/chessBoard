package TestCases;

import ChessBoardMain.ChessMain;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by mayank on 15/7/17.
 */
public class ChessTests {

    @Test
    public void PieceTypesShouldBeValid(){
        ChessMain pieceValidation = new ChessMain();
        boolean isValid = pieceValidation.valdiatePiece();
        assertEquals(true,isValid);
    }

}
