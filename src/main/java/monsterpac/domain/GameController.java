package monsterpac.domain;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * A játék vezérléséért felel.
 */
public class GameController {
    private final Game game;
    private final ScheduledExecutorService ses;
    
    /**
     * Létrehoz egy GameController példányt.
     * @param game A vezérelt játék.
     */
    public GameController(Game game) {
        this.game = game;
        ses = Executors.newSingleThreadScheduledExecutor();
    }

    /**
     * Elindítja a játékot.
     * @param afterGameAct minden játék kör után lefutó callback függvény
     */
    public void start(Runnable afterGameAct) {
        ses.scheduleWithFixedDelay(new Runnable() {
            @Override
            public void run() {
                if(game.notEnded()) {
                    game.act();
                    afterGameAct.run();
                } else{
                    ses.shutdown();
                }

            }
        }, 0, 1, TimeUnit.SECONDS);
    }

    /**
     * Megállítja a játékot.
     */
    public void stop() {
        ses.shutdownNow();
    }

    /**
     * Megadja a játék állását.
     * @return "NO RESULT YET" ha még folyik a játék
     *          "WIN" ha a játékos nyert
     *          "LOSE" ha a jétkos vesztett
     */
    public String getResult() {
        if(this.game.notEnded()){
            return "NO RESULT YET";
        }else if(this.game.playerWon()){
            return "WIN";
        }else{
            return "LOSE";
        }

    }
    
    public Game getGame() {
        return this.game;
    }
}
