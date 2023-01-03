package 구조패턴.proxy;

public class DefaultGameService implements GameService{

    public void startGame() throws InterruptedException {
        System.out.println("game start!");
    }
}
