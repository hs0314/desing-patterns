package 행동패턴.strategy;

/**
 * 전략 패턴
 *  - 특정 작업을 수행하는 방식이 여러가지일때, 방식을 각 구체클래스로 캡슙화를 하고 공통 전략 인터페이스로 추상화해서
 *    전략을 실제 사용하는 Context 객체에서는 추상화된 인터페이스를 사용한다. 인터페이스를 참조하기 때문에 코드 수정없이 전략 구체클래스를
 *    변경해서 사용할 수 있다.
 *
 * 장점
 *  - 새로운 전략을 추가해도 Context의 기존 코드 변경이 없다. (인터페이스 참조)
 *  - 런타임에 전략 변경이 가능하다.
 *
 * 사용 예시
 *  - 자바 Comparator 인터페이스
 *  - 스프링 ApplicationContext 인터페이스
 *
 */
public class StrategyMain {
    public static void main(String[] args) {
        Context context = new Context();

        // 런타임 시점에 동적으로 전략을 수정할 수 있음
        context.setStrategy(new FirstStrategy());
        context.work1();
        context.work2();

        context.setStrategy(new SecondStrategy());
        context.work1();
        context.work2();
    }
}
