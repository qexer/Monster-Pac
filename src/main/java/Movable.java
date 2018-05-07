// TODO: #import Position #import Field  #import Orientation
// X means the horizontal line on the game table

public class Movable {
    Orientation orientation;
    Position pos;

    Position MoveFrom(Position p){
        switch(orientation){
            case "UP": pos.setY(pos.getY()-1); break;
            case "DOWN": pos.setY(pos.getY()+1); break;
            case "LEFT": pos.setX(pos.getX()-1); break;
            case "RIGHT": pos.setX(pos.getX()+1); break;
        }
        return pos;
    }
    void interactWith(Field f){

    }
    void setOrientation(Orientation o){ orientation = o; }

}
