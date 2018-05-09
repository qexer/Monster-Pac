package monsterpac.domain;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class GameController {
    private final Game game;
    private final ScheduledExecutorService ses;

    public GameController(Game game) {
        this.game = game;
        ses = Executors.newSingleThreadScheduledExecutor();
    }

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

    public void stop() {
        ses.shutdownNow();
    }

    public String getResult() {
        if(this.game.notEnded()){
            return "NO RESULT YET";
        }else if(this.game.playerWon()){
            return "WIN";
        }else{
            return "LOSE";
        }

    }
}
