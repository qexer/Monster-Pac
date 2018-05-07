// TODO: #import Position #import Field #import Orientation

public class Player extends Movable {
    boolean isAlive;
    int score;

    int getScore(){ return score; }
    boolean alive(){ return isAlive; }
    void die(){ isAlive = false; }
}
