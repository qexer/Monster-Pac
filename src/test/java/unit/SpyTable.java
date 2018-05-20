package unit;

import monsterpac.domain.Field;
import monsterpac.domain.Table;

public class SpyTable extends Table {
    private boolean actWasCalled = false;

    public SpyTable(){
        super(null, new Field[][]{{}});
    }

    @Override
    public void moveAll(){
        actWasCalled = true;
    }

    boolean actWasCalled() {
        return actWasCalled;
    }
}
