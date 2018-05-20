package manual;

import monsterpac.domain.Game;
import monsterpac.domain.GameController;
import unit.FakeTable;

public class GameControllerTest {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("creating GameController");

        FakeTable fakeTable = new FakeTable();
        fakeTable.setPlayerIsAlive(true);
        fakeTable.setHasScoreLeft(true);
        GameController controller = new GameController(new Game(fakeTable));

        controller.start(new GameControllerTerminator(fakeTable, controller, new int[]{0}));

        System.out.println(controller.getResult());
    }

    static class GameControllerTerminator implements Runnable{
        private FakeTable fakeTable;
        private GameController controller;
        private final int[] i;

        public GameControllerTerminator(FakeTable fakeTable,GameController controller, int[] i){
            this.fakeTable = fakeTable;
            this.controller = controller;
            this.i = i;
        }

        @Override
        public void run() {
            System.out.println("game acted " + i[0]);
            if(i[0] >= 5){
                fakeTable.setHasScoreLeft(false);
                System.out.println("no more score left");
                System.out.println(controller.getResult());
            }
            i[0] += 1;
        }
    }
}
