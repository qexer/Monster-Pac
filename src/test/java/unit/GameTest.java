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
        t.setHasAnyFruitLeft(false);
        Game game = new Game(t);

        // act
        game.act();

        // assert
        assertThat(game.playerWon()).isTrue();
    }

    @Test
    void player_not_wins_when_any_fruit_is_on_Table() {
        //arrange
        FakeTable t = new FakeTable();
        t.setHasAnyFruitLeft(true);
        Game game = new Game(t);

        //act
        game.act();

        //assert
        assertThat(game.playerWon()).isFalse();
    }

    @Test
    void player_not_wins_when_player_is_not_alive() {
        //arrange
        FakeTable t = new FakeTable();
        t.setplayerIsAlive(false);
        Game game = new Game(t);

        //act
        game.act();

        //assert
        assertThat(game.playerWon()).isFalse();
    }

    @Test
    void player_not_wins_when_player_is_not_alive_and_has_any_fruit_on_Table() {
        //arrange
        FakeTable t = new FakeTable();
        t.setplayerIsAlive(false);
        t.setHasAnyFruitLeft(true);
        Game game = new Game(t);

        //act
        game.act();

        //assert
        assertThat(game.playerWon()).isFalse();
    }

    @Test
    void game_has_not_ended_because_player_is_alive() {
        //arrange
        FakeTable t = new FakeTable();
        t.setplayerIsAlive(true);
        Game game = new Game(t);

        //act
        game.act();

        //assert
        assertThat(game.notEnded()).isTrue();
    }

    @Test
    void game_ended_when_player_is_dead() {
        //arrange
        FakeTable t = new FakeTable();
        t.setplayerIsAlive(false);
        Game game = new Game(t);

        //act
        game.act();

        //assert
        assertThat(game.notEnded()).isFalse();
    }

    @Test
    void game_ended_when_playerWon() {
        //arrange
        FakeTable t = new FakeTable();
        t.setplayerIsAlive(false);
        Game game = new Game(t);

        //act
        game.act();

        //assert
        assertThat(game.notEnded()).isFalse();
    }

    @Test
    void game_not_ended_when_player_not_won_and_playerIsAlive() {
        //arrange
        FakeTable t = new FakeTable();
        t.setplayerIsAlive(true);
        t.setHasAnyFruitLeft(true);
        Game game = new Game(t);

        //act
        game.act();

        //assert
        assertThat(game.notEnded()).isTrue();
    }
}

