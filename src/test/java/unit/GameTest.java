package unit;

import monsterpac.domain.Game;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class GameTest {

    @Test
    void act_calls_act_on_Table(){
        // arrange
        SpyTable table = new SpyTable();
        Game g = new Game(table);

        // act
        g.act();

        // assert
        assertThat(table.actWasCalled()).isTrue();
    }

    @Test
    void can_not_be_constructed_with_null_Table() {
        assertThatThrownBy(() -> new Game(null)).hasMessage("Table can not be null.");
    }

    @Test
    void player_wins_when_no_fruit_left_and_player_is_alive() {
        // arrange
        FakeTable t = new FakeTable();
        Game game = new Game(t);

        // act
        game.act();

        // assert
        assertThat(game.playerWon()).isTrue();
    }
}

