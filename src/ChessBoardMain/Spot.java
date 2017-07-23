package ChessBoardMain;

/**
 * Created by mayank on 23/7/17.
 */
public class Spot {
    int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    int y;

    public Spot(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
