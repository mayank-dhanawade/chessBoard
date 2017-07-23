package ChessBoardMain;

/**
 * Created by mayank on 15/7/17.
 */
public class ChessMain {
    String[] yValue = {"A","B","C","D","E","F","G","H"};
    String[][] spots = new String[8][8];

    public ChessMain(){

        for(int i=0;i<this.spots.length;i++){
            for(int j=0; j<this.spots.length; j++){
                spots[i][j] = yValue[j] + "" + (i+1);
            }
        }
    }

    public boolean testRunner(String pieceAndPosition){
        String piece = pieceAndPosition.split(" ")[0].trim();
        String position = pieceAndPosition.split(" ")[1].trim();
        if(!valdiatePiece(piece)){
            System.out.println("Invalid piece");
        }
        Spot spot = validatePosition(position);
        if(spot == null){
            System.out.println("Invalid position");
        }

        return false;
    }


    public boolean valdiatePiece(String piece){
        for (PieceEnum p : PieceEnum.values()) {
            if (p.name().equalsIgnoreCase(piece))
                return true;

        }
        return false;
    }

    public Spot validatePosition(String position){

        for(int i=0;i<this.spots.length;i++){
            for(int j=0; j<this.spots.length; j++){
                if(spots[i][j].equalsIgnoreCase(position)){
                    Spot spot = new Spot(i,j);
                    return spot;
                }
            }
        }
        return null;
    }

}
