package monsterpac.domain;

/**
 * <h1>Position osztály</h1>
 * A táblán elhelyezett elemek pozíciójának leírására szolgál.
 */
public class Position {
    private int x;
    private int y;

    /**
     * Konstruktor
     * @param x X
     * @param y Y
     */
    public Position(int x, int y){
        this.x = x;
        this.y = y;
    }

    /**
     * X értékét visszaadó getter
     * @return X
     */
    public int getX(){
        return x;
    }

    /**
     * Y értékét visszaadó getter
     * @return Y
     */
    public int getY(){
        return y;
    }

    /**
     * X értékét beállító setter
     * @return X
     */
    public void setX(int x){
        this.x = x;
    }

    /**
     * Y értékét beállító setter
     * @return Y
     */
    public void setY(int y){
        this.y = y;
    }
}
