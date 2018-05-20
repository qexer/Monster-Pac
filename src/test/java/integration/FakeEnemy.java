package integration;

import monsterpac.domain.Enemy;
import monsterpac.domain.Position;

public class FakeEnemy extends Enemy {
    @Override
    public Position moveFrom(Position p) {
        return new Position(0,0);
    }
}