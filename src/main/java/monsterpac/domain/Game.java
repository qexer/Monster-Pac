package monsterpac.domain;

/**
 * Felelőssége egy Table objektum vezérlése és felület biztosítása a játék végének
 * és kimenetelének lekérdezéséhez.
 */
public class Game {

    private Table table;

    /**
     * Létrehoz egy Game példányt.
     * @param table A vezérelt Table példány.
     * @throws IllegalArgumentException Ha a table null.
     */
    public Game(Table table) {
        if(table == null){
            throw new IllegalArgumentException("Table can not be null.");
        }
        this.table = table;
    }

    /**
     * Végrehajt egy kört a játékból.
     */
    public void act() {
        this.table.moveAll();
    }

    /**
     * Megadja, hogy a játékos nyert-e vagy sem.
     * @return true ha a játékos nyert; egyébként false
     */
    public boolean playerWon() {
        return !this.table.hasScoreLeft() && this.table.playerIsAlive();
    }

    /**
     * Megadja, hogy a játék véget ért-e vagy sem.
     * @return false ha a játék véget ért; egyébként true
     */
    public boolean notEnded() {
        if(playerWon()){
            return false;
        }
        return this.table.playerIsAlive();
    }
    
    public Table getTable() {
        return this.table;
    }
}
