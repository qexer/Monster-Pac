package unit;

import monsterpac.domain.Field;
import monsterpac.domain.Table;

public class FakeTable extends Table {

    public FakeTable(){
        super(null, new Field[][]{ { } });
    }

    private boolean hasScoreLeft = true;
    private boolean playerIsAlive = true;

    @Override
    public boolean hasScoreLeft(){
        return hasScoreLeft;
    }

    @Override
    public boolean playerIsAlive(){
        return playerIsAlive;
    }

    public void setHasScoreLeft(boolean value){
        this.hasScoreLeft = value;
    }

    public void setPlayerIsAlive(boolean value){
        this.playerIsAlive = value;
    }
}
