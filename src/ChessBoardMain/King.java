package ChessBoardMain;

/**
 * Created by mayank on 23/7/17.
 */
public class King implements ChessPiece {

    int[][] offsets = { { 1, 0 }, { -1, 0 }, { 0, 1 }, { 0, -1 }, { 1, -1 }, { -1, 1 }, { 1, 1 }, { -1, -1 } };
    @Override
    public String possibleMoves(Spot spot) {
        StringBuffer output = new StringBuffer();
        String[][] test = new String[8][8];
        ValidatePositionAndConvertIndex validatePositionAndConvertIndex = new ValidatePositionAndConvertIndex();
        for (int i = 0; i < offsets.length; i++) {
            if(validatePositionAndConvertIndex.isValid((spot.getX() + offsets[i][0]), (spot.getY() + 1 + offsets[i][1]))){

                System.out.println(validatePositionAndConvertIndex.convertIndex((spot.getX() + offsets[i][0])) + " " + (spot.getY() + offsets[i][1]));
            }
        }


        return "set";
    }

}
