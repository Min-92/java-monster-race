package race.monster.ragdoll;

public class GameMachine {
    public static void main(String[] args) {
        RacingGame newGame = new RacingGame();

        newGame.configureGameSettings();
        newGame.startGame();
        newGame.finishGame();
    }
}
