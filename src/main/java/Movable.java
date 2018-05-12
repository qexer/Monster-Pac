import Position;
import Field;
import Orientation;

/**
 * <h1>Movable osztály</h1>
 * A táblán lévő minden mozgatható objektum alapja. Ebből származik a Player és az Enemy osztály.
 * <b>Note:</b> Csak az alosztályai léteznek a táblán.
 */
// X means the horizontal line on the game table

public class Movable {
    Orientation orientation;
    Position pos;

    /**
     * Mozgást leíró metódus. A jelenlegi iránynak megfelelően lép egy mezőt a táblán.
     * @param p Jelenlegi irány
     * @return
     */
    Position MoveFrom(Position p){
        switch(orientation){
            case "UP": pos.setY(pos.getY()-1); break;
            case "DOWN": pos.setY(pos.getY()+1); break;
            case "LEFT": pos.setX(pos.getX()-1); break;
            case "RIGHT": pos.setX(pos.getX()+1); break;
        }
        return pos;
    }

    /**
     * Mezővel való interakció
     * @param f Mező
     */
    void interactWith(Field f){}

    /**
     * Irányt beállító metódus.
     * @param o Irány
     */
    void setOrientation(Orientation o){ orientation = o; }
}
