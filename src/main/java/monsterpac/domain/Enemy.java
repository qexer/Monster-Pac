package monsterpac.domain;

import java.util.Random;

/**
 * <h1>Enemy osztály</h1>
 * A táblán elhelyezkedő ellenségek reprezentálására szolgál.
 */
public class Enemy extends Movable {

    Position lastpos;
    Random rand = new Random();

    /**
     * Mozgást leíró metódus. A jelenlegi iránynak megfelelően lép egy mezőt a táblán.
     * @param p Jelenlegi irány
     * @return Hova fog lépni
     */
    @Override
    Position MoveFrom(Position p){
        if(lastpos != p) {
            switch (orientations) {
                case UP:
                    pos.setY(pos.getY() - 1);
                    break;
                case DOWN:
                    pos.setY(pos.getY() + 1);
                    break;
                case LEFT:
                    pos.setX(pos.getX() - 1);
                    break;
                case RIGHT:
                    pos.setX(pos.getX() + 1);
                    break;
            }
        }else{ // Helyben maradtunk az előbb, új írány kell. (Falba ütköztünk vagy hasonló.)
            switch (orientations) {
                case UP:
                    switch(rand.nextInt(3)) {
                        case 0: setOrientations(Orientations.DOWN); pos.setY(pos.getY() + 1); break;
                        case 1: setOrientations(Orientations.LEFT); pos.setX(pos.getX() - 1); break;
                        case 2: setOrientations(Orientations.RIGHT); pos.setX(pos.getX() + 1); break;
                    }
                    break;
                case DOWN:
                    switch(rand.nextInt(3)) {
                        case 0: setOrientations(Orientations.UP); pos.setY(pos.getY() - 1); break;
                        case 1: setOrientations(Orientations.LEFT); pos.setX(pos.getX() - 1); break;
                        case 2: setOrientations(Orientations.RIGHT); pos.setX(pos.getX() + 1); break;
                    }
                    break;
                case LEFT:
                    switch(rand.nextInt(3)) {
                        case 0: setOrientations(Orientations.UP); pos.setY(pos.getY() - 1); break;
                        case 1: setOrientations(Orientations.DOWN); pos.setY(pos.getY() + 1); break;
                        case 2: setOrientations(Orientations.RIGHT); pos.setX(pos.getX() + 1); break;
                    }
                    break;
                case RIGHT:
                    switch(rand.nextInt(3)) {
                        case 0: setOrientations(Orientations.UP); pos.setY(pos.getY() - 1); break;
                        case 1: setOrientations(Orientations.DOWN); pos.setY(pos.getY() + 1); break;
                        case 2: setOrientations(Orientations.LEFT); pos.setX(pos.getX() - 1); break;
                    }
                    break;
            }
        }
        lastpos = p;
        return pos;
    }
}
