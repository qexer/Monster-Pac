package unit;

import monsterpac.domain.Table;

public class FakeTable extends Table {

    private boolean hasAnyFruitLeft = true;
    private boolean playerIsAlive = true;

    @Override
    public boolean hasAnyFruitLeft(){
        return hasAnyFruitLeft;
    }

    @Override
    public boolean playerIsAlive(){
        return playerIsAlive;
    }

    public void setHasAnyFruitLeft(boolean value){
        this.hasAnyFruitLeft = value;
    }

    public void setplayerIsAlive(boolean value){
        this.playerIsAlive = value;
    }
}
