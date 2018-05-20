package monsterpac.domain;

public class Factory {
    public static GameController createGameController() {
        Player player = new Player();
        Field[][] fields = createFields(player);
        Table table = new Table(player, fields);
        Game game = new Game(table);
        GameController gameController = new GameController(game);
        return gameController;
    }

    private static Field[][] createFields(Player player) {
        return new Field[][]{
                {
                        create(player),
                        createEmpty(),
                        createEmpty(),
                        createEmpty(),
                        createEnemy(),
                        createEmpty(),
                        createEmpty(),
                        createEmpty(),
                        createEmpty(),
                        createEmpty()
                },
                {
                        createEmpty(),
                        createWall(),
                        createWall(),
                        createEmpty(),
                        createEmpty(),
                        createEmpty(),
                        createWall(),
                        createWall(),
                        createEmpty(),
                        createEmpty(),
                },
                {
                        createEmpty(),
                        createWall(),
                        createWall(),
                        createEmpty(),
                        createEmpty(),
                        createScore(),
                        createWall(),
                        createWall(),
                        createEmpty(),
                        createEmpty(),
                },
                {
                        createScore(),
                        createEmpty(),
                        createEmpty(),
                        createEmpty(),
                        createWall(),
                        createEmpty(),
                        createEmpty(),
                        createEmpty(),
                        createEmpty(),
                        createEmpty()
                },
                {
                        createEmpty(),
                        createEmpty(),
                        createEmpty(),
                        createScore(),
                        createWall(),
                        createEmpty(),
                        createEmpty(),
                        createEmpty(),
                        createWall(),
                        createEmpty()
                },
                {
                        createScore(),
                        createEmpty(),
                        createEmpty(),
                        createEmpty(),
                        createWall(),
                        createEmpty(),
                        createEmpty(),
                        createScore(),
                        createEmpty(),
                        createEmpty()
                },
                {
                        createEmpty(),
                        createWall(),
                        createWall(),
                        createEmpty(),
                        createEmpty(),
                        createEmpty(),
                        createWall(),
                        createWall(),
                        createEmpty(),
                        createEmpty(),
                },
                {
                        createEmpty(),
                        createWall(),
                        createWall(),
                        createEmpty(),
                        createEmpty(),
                        createScore(),
                        createWall(),
                        createWall(),
                        createEmpty(),
                        createEmpty(),
                },
                {
                        createEmpty(),
                        createEmpty(),
                        createEmpty(),
                        createEmpty(),
                        createEmpty(),
                        createEmpty(),
                        createEmpty(),
                        createEmpty(),
                        createEmpty(),
                        createEmpty(),
                },
                {
                        createEmpty(),
                        createEmpty(),
                        createEmpty(),
                        createEmpty(),
                        createEnemy(),
                        createEmpty(),
                        createEmpty(),
                        createEmpty(),
                        createEmpty(),
                        createEmpty(),
                }
        };
    }

    private static Field createEmpty() {
        return new Field(false, true, null);
    }

    private static Field createWall() {
        return new Field(false, false, null);
    }

    private static Field createScore() {
        return new Field(true, true, null);
    }

    private static Field create(Player player) {
        return new Field(false, true, player);
    }

    private static Field createEnemy() {
        return new Field(false, true, new Enemy());
    }
}
