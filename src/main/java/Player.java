// TODO: #import Position #import Field #import Orientation

public class Player extends Movable {
    boolean isAlive;
    int score;

    int getScore(){ return score; }
    boolean alive(){ return isAlive; }
    void die(){ isAlive = false; }
    @Override
    void interactWith(Field f){
        if(f.hasScore()){f.pickUpScore();}
        if(f.getMovable().getClass() != this.getClass() && f.getMovable().getClass() != null){ die(); }
    }
}
