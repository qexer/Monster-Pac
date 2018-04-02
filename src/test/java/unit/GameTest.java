package unit;

import monsterpac.domain.Game;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class GameTest {

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

    @Test
    void can_not_be_constructed_with_null_Table() {
        assertThatThrownBy(() -> new Game(null)).hasMessage("Table can not be null.");
    }

}

