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
     * @param position Jelenlegi pozíció
     * @return Az új pozíció
     */
    public Position moveFrom(Position position){
        switch(orientations){
            case UP: position.setY(position.getY()-1); break;
            case DOWN: position.setY(position.getY()+1); break;
            case LEFT: position.setX(position.getX()-1); break;
            case RIGHT: position.setX(position.getX()+1); break;
        }
        return position;
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
