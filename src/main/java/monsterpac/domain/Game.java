package monsterpac.domain;

public class Game {

    private Table table;

    public Game(Table table) {
        if(table == null){
            throw new IllegalArgumentException("Table can not be null.");
        }
        this.table = table;
    }

    public void act() {
        this.table.act();
    }

    public boolean playerWon() {
        return !this.table.hasAnyFruitLeft() && this.table.playerIsAlive();
    }

    public boolean notEnded() {
        if(playerWon()){
            return false;
        }
        return this.table.playerIsAlive();
    }
}
