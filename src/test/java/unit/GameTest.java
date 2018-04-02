package unit;

import monsterpac.domain.Game;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class GameTest {

    @Test
    void act_calls_act_on_Table(){
        // arrange
        SpyTable t = new SpyTable();
        Game g = new Game(t);

        // act
        g.act();

        // assert
        assertThat(t.actWasCalled()).isTrue();
    }
}

