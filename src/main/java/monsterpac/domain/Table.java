package monsterpac.domain;

import java.util.ArrayList;
import java.util.HashMap;

public class Table {

    /**
     * Vertical length of table (height)
     */
    private final int FIELD_X_MAX;

    /**
     * Horizontal length of table (width)
     */
    private final int FIELD_Y_MAX;

    /**
     * Init score
     */
    private final int initialScore;

    /**
     * The Player object
     */
    private final Player player;

    /**
     * List of movables
     */
    private final ArrayList<Movable> movables;

    /**
     * Fields of the Table
     */
    private final Field[][] fields;

    /**
     * Positions of Movables
     */
    private HashMap<Movable, Position> positions;


    public Table(Player player, Field[][] fields) {

        this.player = player;
        this.fields = fields;
        this.FIELD_X_MAX = fields.length;
        this.FIELD_Y_MAX = fields[0].length;

        this.movables = this.getMovablesFromFields();
        this.initialScore = this.getInitialScoreFromField();
        this.positions = this.getPositionsOfMovablesFromFields();

    }

    /**
     * Get the list of movables from Fields property
     *
     * @return List of movables
     */
    private ArrayList<Movable> getMovablesFromFields() {

        ArrayList<Movable> movables = new ArrayList<>();

        for (int i = 0; i < this.fields.length; ++i) {
            for (int j = 0; j < this.fields[i].length; ++j) {
                Field f = this.fields[i][j];

                if (f.getMovable() != null) {
                    movables.add(f.getMovable());
                }
            }
        }

        return movables;
    }

    /**
     * Gets the initial score from the fields matrix
     *
     * @return The initial score
     */
    private int getInitialScoreFromField() {
        int is = 0;

        for (int i = 0; i < this.fields.length; ++i) {
            for (int j = 0; j < this.fields[i].length; ++j) {
                Field f = this.fields[i][j];

                if (f.hasScore()) {
                    ++is;
                }
            }
        }

        return is;
    }

    /**
     * Gets the position and movable HashMap from fields matrix
     *
     * @return The hashmap contains the movables and positions
     */
    private HashMap<Movable, Position> getPositionsOfMovablesFromFields() {

        HashMap<Movable, Position> positions = new HashMap<>();

        for (int i = 0; i < this.fields.length; ++i) {
            for (int j = 0; j < this.fields[i].length; ++j) {
                Field field = this.fields[i][j];

                if (field.getMovable() != null) {
                    positions.put(field.getMovable(), new Position(i, j));
                }
            }
        }
        return positions;
    }

    /**
     * @param p The target position object
     * @return true, if positions is out of the table; false otherwise
     */
    private boolean outOfRange(Position p) {
        int x = p.getX();
        int y = p.getY();

        return (
                x < 0 || x > this.FIELD_X_MAX ||
                        y < 0 || y > this.FIELD_Y_MAX
        );
    }

    /**
     * Get a field by its position
     *
     * @param p The position
     * @return The field of that position
     */
    private Field getFieldByPos(Position p) {
        return this.fields[p.getX()][p.getY()];
    }

    /**
     * Move a movable to a new position
     *
     * @param m The movable object
     * @param p The new position
     */
    private void moveTo(Movable m, Position p) {
        this.positions.put(m, p);
    }

    /**
     * Moves all movable to a new position
     */
    public void moveAll() {
        for (Movable m : movables) {
            Position current_position = this.positions.get(m);

            Position new_position = m.moveFrom(current_position);

            if (!this.outOfRange(new_position) && this.getFieldByPos(new_position).passable()) {
                m.interactWith(this.getFieldByPos(new_position));
                moveTo(m, new_position);
            }

        }
    }

    public Player getPlayer() {
        return this.player;
    }

    public int scoreLeft() {
        return this.initialScore;
    }

    public boolean hasScoreLeft() {
        return this.scoreLeft() != 0;
    }

    public boolean playerIsAlive() {
        return this.player.alive();
    }
}