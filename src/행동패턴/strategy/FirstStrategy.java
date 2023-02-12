package 행동패턴.strategy;

public class FirstStrategy implements Strategy{
    @Override
    public void work1() {
        System.out.println("FirstStrategy work1");
    }

    @Override
    public void work2() {
        System.out.println("FirstStrategy work2");
    }
}
