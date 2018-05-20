package monsterpac.domain;
/**
 * <h1>Player osztály</h1>
 * A táblán elhelyezkedő játékos reprezentálására szolgál.
 */
public class Player extends Movable {
    boolean isAlive = true;
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
    public void die(){ isAlive = false; }

    /**
     * Mezővel való interakció
     * @param f Mező
     */
    @Override
    public void interactWith(Field f){
        if(f.hasScore()){f.pickUpScore();}
        if(f.getMovable() instanceof Enemy){ die(); }
    }
}
