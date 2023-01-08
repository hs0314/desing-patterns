package 행동패턴.command;

public class GameStartCommand implements Command{

    private Game game;

    public GameStartCommand(Game game) {
        this.game = game;
    }
    @Override
    public void execute() {
        game.start();
    }
}
