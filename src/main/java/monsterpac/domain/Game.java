package monsterpac.domain;

public class Game {

    private Table table;

    public Game(Table table) {

        this.table = table;
    }

    public void act() {
        this.table.act();
    }
}
