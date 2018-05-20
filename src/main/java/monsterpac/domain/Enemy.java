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
     * @param position Jelenlegi pozíció
     * @return Hova lépett
     */
    @Override
    public Position moveFrom(Position position){
        if(lastpos != position) {
            switch (orientations) {
                case UP:
                    position.setY(position.getY() - 1);
                    break;
                case DOWN:
                    position.setY(position.getY() + 1);
                    break;
                case LEFT:
                    position.setX(position.getX() - 1);
                    break;
                case RIGHT:
                    position.setX(position.getX() + 1);
                    break;
            }
        }else{ // Helyben maradtunk az előbb, új írány kell. (Falba ütköztünk vagy hasonló.)
            switch (orientations) {
                case UP:
                    switch(rand.nextInt(3)) {
                        case 0: setOrientations(Orientations.DOWN); position.setY(position.getY() + 1); break;
                        case 1: setOrientations(Orientations.LEFT); position.setX(position.getX() - 1); break;
                        case 2: setOrientations(Orientations.RIGHT); position.setX(position.getX() + 1); break;
                    }
                    break;
                case DOWN:
                    switch(rand.nextInt(3)) {
                        case 0: setOrientations(Orientations.UP); position.setY(position.getY() - 1); break;
                        case 1: setOrientations(Orientations.LEFT); position.setX(position.getX() - 1); break;
                        case 2: setOrientations(Orientations.RIGHT); position.setX(position.getX() + 1); break;
                    }
                    break;
                case LEFT:
                    switch(rand.nextInt(3)) {
                        case 0: setOrientations(Orientations.UP); position.setY(position.getY() - 1); break;
                        case 1: setOrientations(Orientations.DOWN); position.setY(position.getY() + 1); break;
                        case 2: setOrientations(Orientations.RIGHT); position.setX(position.getX() + 1); break;
                    }
                    break;
                case RIGHT:
                    switch(rand.nextInt(3)) {
                        case 0: setOrientations(Orientations.UP); position.setY(position.getY() - 1); break;
                        case 1: setOrientations(Orientations.DOWN); position.setY(position.getY() + 1); break;
                        case 2: setOrientations(Orientations.LEFT); position.setX(position.getX() - 1); break;
                    }
                    break;
            }
        }
        lastpos = position;
        return position;
    }
}
