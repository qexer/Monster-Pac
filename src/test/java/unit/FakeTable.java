package unit;

import monsterpac.domain.Table;

public class FakeTable extends Table {

    @Override
    public boolean hasAnyFruitLeft(){
        return false;
    }

    @Override
    public boolean playerIsAlive(){
        return true;
    }
}
