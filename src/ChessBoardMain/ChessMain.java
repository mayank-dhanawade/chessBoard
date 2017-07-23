package ChessBoardMain;

import java.util.ArrayList;

/**
 * Created by mayank on 15/7/17.
 */
public class ChessMain {
    String[] xValueChar = {"A","B","C","D","E","F","G","H"};

    String[][] spots = new String[8][8];

    public ChessMain(){

        for(int i=1;i<this.spots.length;i++){
            for(int j=1; j<this.spots.length; j++){
                spots[i][j] = xValueChar[j] + "" + (i+1);
            }
        }
    }

    public boolean testRunner(String pieceAndPosition){
        String piece = pieceAndPosition.split(" ")[0].trim();
        String position = pieceAndPosition.split(" ")[1].trim();
        PieceEnum pieceEnum = valdiatePiece(piece);
        if(pieceEnum == null){
            System.out.println("Invalid piece");
        }
        Spot spot = validatePosition(position);
        if(spot == null){
            System.out.println("Invalid position");
        }

        PieceFactory pieceFactory = new PieceFactory();

        ChessPiece chessPiece = pieceFactory.getChessPiece(pieceEnum);
        String test = chessPiece.possibleMoves(spot);
        System.out.println(test);
        return false;
    }


    public PieceEnum valdiatePiece(String piece){
        for (PieceEnum p : PieceEnum.values()) {
            if (p.name().equalsIgnoreCase(piece))
                return p;

        }
        return null;
    }

    public Spot validatePosition(String position){
        String xValue = position.substring(0,1);

        for(int i = 1; i<xValueChar.length ; i++){
            if(xValue.equalsIgnoreCase(xValueChar[i])){
                Spot spot = new Spot(i+1,Integer.parseInt(position.substring(1)));
                System.out.println("x" + spot.getX() + "y" + spot.getY());
                return spot;
            }
        }
        return null;
    }

}
