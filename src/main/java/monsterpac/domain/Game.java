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
        this.table.moveAll();
    }

    public boolean playerWon() {
        return !this.table.hasScoreLeft() && this.table.playerIsAlive(); //@TODO add Table.playerIsAlive() to UML diagram or implement it here
    }

    //@TODO remove playerLost() from UML diagram

    public boolean notEnded() { //@TODO rename in UML diagram
        if(playerWon()){
            return false;
        }
        return this.table.playerIsAlive();
    }
}
