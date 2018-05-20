import monsterpac.domain.Movable;

public class Field {
    private Movable mov;
    private boolean score;
    private boolean passable;

    public Field(boolean score, boolean passable, Movable mov){
        this.score = score;
        this.passable = passable;
        this.mov = mov;
    }

    public boolean hasScore(){
        return score;
    }

    public boolean passable(){
        return passable;
    }

    public Movable getMovable(){
        return mov;
    }

    public void setMovable(Movable mov){
        this.mov = mov;
    }

    public void pickUpScore(){
        score = false;
    }
}
