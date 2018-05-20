package integration;

import monsterpac.domain.Enemy;
import monsterpac.domain.Position;

public class StaticFakeEnemy extends Enemy {
    @Override
    public Position moveFrom(Position position) {
        return position;
    }
}
