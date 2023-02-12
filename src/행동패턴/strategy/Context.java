package 행동패턴.strategy;

// 전략객체를 실제 사용하는 Context 객체
public class Context {

    Strategy strategy;

    public Context() {
    }

    public void work1(){
        strategy.work1();
    }

    public void work2(){
        strategy.work2();
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
}
