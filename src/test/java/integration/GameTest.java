package integration;

import monsterpac.domain.*;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class GameTest {
    @Test
    void player_wins_when_no_score_has_left() {
        // arrange
        Player player = new Player();
        Field[][] fields = {
                {
                    new Field(false, true, player),
                    new Field(true, true,null)
                }
        };
        Table table = new Table(player, fields);
        Game game = new Game(table);

        // act
        player.setOrientations(Orientations.DOWN);
        game.act();

        // assert
        assertThat(game.notEnded()).isFalse();
        assertThat(game.playerWon()).isTrue();
    }
}
