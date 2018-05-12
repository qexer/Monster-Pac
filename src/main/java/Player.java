import Position;
import Field;
import Orientation;

/**
 * <h1>Player osztály</h1>
 * A táblán elhelyezkedő játékos reprezentálására szolgál.
 */
public class Player extends Movable {
    boolean isAlive;
    int score;

    /**
     * A játékos pontszáma
     * @return pontszám
     */
    int getScore(){ return score; }

    /**
     * A játékos életben van-e még?
     * @return él-e?
     */
    boolean alive(){ return isAlive; }

    /**
     * Ha a játékos elhalálozik, akkor ez a metódus felelős az isAlive adattag megváltoztatásáért.
     */
    void die(){ isAlive = false; }

    /**
     * Mezővel való interakció
     * @param f Mező
     */
    @Override
    void interactWith(Field f){
        if(f.hasScore()){f.pickUpScore();}
        if(f.getMovable().getClass() != this.getClass() && f.getMovable().getClass() != null){ die(); }
    }
}
