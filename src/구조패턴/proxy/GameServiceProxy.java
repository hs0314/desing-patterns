package 구조패턴.proxy;

public class GameServiceProxy extends DefaultGameService {

    private GameService gameService;

    public GameServiceProxy(GameService gameService) {
        this.gameService = gameService;
    }

    @Override
    public void startGame() throws InterruptedException {
        long before = System.currentTimeMillis();

        gameService.startGame();
        Thread.sleep(1000);

        System.out.println(System.currentTimeMillis() - before);
    }
}
