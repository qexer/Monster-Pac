package integration;

import monsterpac.domain.Enemy;
import monsterpac.domain.Field;
import monsterpac.domain.Player;
import monsterpac.domain.Position;

public class FakeEnemy extends Enemy {
    @Override
    public Position moveFrom(Position p) {
        return new Position(0,0);
    }

    @Override
    public void interactWith(Field f) {
        ((Player)f.getMovable()).die();
    }
}