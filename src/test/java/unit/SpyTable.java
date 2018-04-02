package unit;

import monsterpac.domain.Table;

public class SpyTable extends Table {
    private boolean actWasCalled = false;

    @Override
    public void act(){
        actWasCalled = true;
    }

    boolean actWasCalled() {
        return actWasCalled;
    }
}
