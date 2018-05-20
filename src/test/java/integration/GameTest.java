package integration;

import monsterpac.domain.*;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class GameTest {
    @Test
    void game_ends_and_player_wins_when_no_score_has_left() {
        // arrange
        Player player = new Player();
        Field[] fields = {
                create(player),
                createScore()
        };
        Game game = createGame(player, fields);

        // act
        player.setOrientations(Orientations.DOWN);
        game.act();

        // assert
        assertThat(game.notEnded()).isFalse();
        assertThat(game.playerWon()).isTrue();
    }

    @Test
    void game_not_ends_when_some_score_has_left() {
        // arrange
        Player player = new Player();
        Field[] fields = {
                create(player),
                createScore(),
                createScore()
        };
        Game game = createGame(player, fields);

        // act
        player.setOrientations(Orientations.DOWN);
        game.act();

        // assert
        assertThat(game.notEnded()).isTrue();
    }

    @Test
    void game_ends_and_player_loses_when_player_moves_to_an_enemy() {
        // arrange
        Player player = new Player();
        Field[] fields = {
                create(player),
                create(new StaticFakeEnemy()),
                createScore() // to ensure some score left
        };
        Game game = createGame(player, fields);

        // act
        player.setOrientations(Orientations.DOWN);
        game.act();

        // assert
        assertThat(game.notEnded()).isFalse();
        assertThat(game.playerWon()).isFalse();
    }

    @Test
    void game_ends_and_player_loses_when_enemy_moves_to_the_player() {
        // arrange
        Player player = new Player();
        Field[] fields = {
                create(player),
                create(new FakeEnemy()),
                createScore() // to ensure some score left
        };
        Game game = createGame(player, fields);

        // act
        player.setOrientations(Orientations.UP);
        game.act();

        // assert
        assertThat(game.notEnded()).isFalse();
        assertThat(game.playerWon()).isFalse();
    }

    private Game createGame(Player player, Field[] fields1) {
        Field[][] fields = { fields1 };
        Table table = new Table(player, fields);
        return new Game(table);
    }

    private Field createScore() {
        return new Field(true, true, null);
    }

    private Field create(Movable movable) {
        return new Field(false, true, movable);
    }
}
