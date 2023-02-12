package 행동패턴.strategy;

public class SecondStrategy implements Strategy{
    @Override
    public void work1() {
        System.out.println("SecondStrategy work1");
    }

    @Override
    public void work2() {
        System.out.println("SecondStrategy work2");
    }
}
