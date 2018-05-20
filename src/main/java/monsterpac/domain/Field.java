package monsterpac.domain;

/**
 * <h1>Field osztály</h1>
 * A mezők reprezentálására szolgál.
 */
public class Field {
    private Movable mov;
    private boolean score;
    private boolean passable;

    /**
     * Konstruktor
     * @param score Van-e ott (begyűjthető) pont?
     * @param passable Át lehet-e menni a mezőn?
     * @param mov A mezőn álló, mozogni képes figura
     */
    public Field(boolean score, boolean passable, Movable mov){
        this.score = score;
        this.passable = passable;
        this.mov = mov;
    }

    /**
     * Van-e a mezőn gyűjthető pont?
     * @return Igen/Nem
     */
    public boolean hasScore(){
        return score;
    }

    /**
     * Rá lehet-e lépni a mezőre?
     * @return Igen/Nem
     */
    public boolean passable(){
        return passable;
    }

    /**
     * A mezőn lévő mozgatható elem
     * @return Player/Enemy/NULL
     */
    public Movable getMovable(){
        return mov;
    }

    /**
     * A mezőre lépett valaki
     * @param mov Enemy/Player/NULL
     */
    public void setMovable(Movable mov){
        this.mov = mov;
    }

    /**
     * A játékos felvette a mezőre lépésért járó pontot
     */
    public void pickUpScore(){
        score = false;
    }
}
