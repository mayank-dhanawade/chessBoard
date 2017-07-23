package ChessBoardMain;

/**
 * Created by mayank on 23/7/17.
 */
public class ValidatePositionAndConvertIndex {
    String[] yValue = {"A","B","C","D","E","F","G","H"};
    public boolean isValid(int x,int y){
        if((x>=0 && x<8) && (y>=0 && y<8))
            return true;
        return false;
    }

    public String convertIndex(Integer xAxis){
       return yValue[xAxis - 1];
    }
}
