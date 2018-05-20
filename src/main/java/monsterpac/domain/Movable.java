package monsterpac.domain;

/**
 * <h1>Movable osztály</h1>
 * A táblán lévő minden mozgatható objektum alapja. Ebből származik a Player és az monsterpac.domain.Enemy osztály.
 * <b>Note:</b> Csak az alosztályai léteznek a táblán.
 */
// X means the horizontal line on the game table

public class Movable {
    Orientations orientations;

    /**
     * Mozgást leíró metódus. A jelenlegi iránynak megfelelően lép egy mezőt a táblán.
     * @param p Jelenlegi pozíció
     * @return Az új pozíció
     */
    public Position moveFrom(Position p){
        switch(orientations){
            case UP: p.setY(p.getY()-1); break;
            case DOWN: p.setY(p.getY()+1); break;
            case LEFT: p.setX(p.getX()-1); break;
            case RIGHT: p.setX(p.getX()+1); break;
        }
        return p;
    }

    /**
     * Mezővel való interakció
     * @param f Mező
     */
    public void interactWith(Field f){}

    /**
     * Irányt beállító metódus.
     * @param o Irány
     */
    public void setOrientations(Orientations o){ orientations = o; }
}
