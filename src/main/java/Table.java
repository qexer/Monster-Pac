//@TODO: import field, player, movable, position

import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class Table() {
	/**
	* Init score
	*/
	private int initialScore;

	/**
	* The Player object
	*/
	private Player player;

	/**
	* List of enemys
	*/
	private ArrayList<Movable> movables;

	/**
	* Fields of the Table
	*/
	private Field[][] fields;

	/**
	* Vertical length of table (height)
	*/
	private final int FIELD_X_MAX = 10;
	/**
	* Horizontal length of table (width)
	*/
	private final int FIELD_Y_MAX = 10;

	/**
	* Positions of Movables
	*/
	private HashMap positions;


	public Table( Player player ) {
		this.player = player;

		this.movables = new ArrayList<>();
		//@TODO: Enemyk feltöltése

		this.fields = new Field[this.FIELD_X_MAX][this.FIELD_Y_MAX]; //@TODO: mező mérete

		this.initialScore = 0; //@TODO: pont meghatározása

		this.positions = new HashMap();

		for ( Movable m : movables ) {
			//@TODO movable-nek poziciot adni, és belerakni a positionsbe
			Position p = new Position(0,0); //x, y

			this.positions.add( m, p );
		}
	}

	private boolean outOfRange( Position p ) {
		int x = p.get(x);
		int y = p.get(y);

		return ( 
			x < 0 || x > this.FIELD_X_MAX ||
			y < 0 || y > this.FIELD_Y_MAX 
		);
	}

	private Field getFieldByPos( Position p ) {
		return this.fields[p.get(x)][p.get(y)];
	}

	private void moveTo( Movable m, Position new ) {
		this.positions.put(m, new);
	}

	public void moveAll() {
		for ( Movable m : movables ) {
			Position current_position = this.positions.get(m);

			Position new_position = m.moveFrom(current_position);

			if ( !this.outOfRange( new_position ) && this.getFieldByPos( new_position ).passable() ) {
				m.interactWith( this.getFieldByPos( new_position ) );
				moveTo(m, new_position);
			}

		}
	}

	public Player getPlayer() { return this.player; }

	public int scoreLeft() { return this.score; }
}