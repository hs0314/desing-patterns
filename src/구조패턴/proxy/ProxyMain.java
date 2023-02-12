package 구조패턴.proxy;

/**
 * 프록시 패턴
 *  - client가 원래 사용하려는 객체를 직접 사용하지 않고 proxy객체(대리인)를 거쳐서 사용
 *  - subject 인터페이스를 타겟 서비스 객체(DefaultGameService), proxy 객체(GameServiceProxy)가 구현하고
 *    proxy객체는 내부 필드에 subject타입을 들고 있음으로써 타겟 서비스 객체 호출이 가능
 *  - proxy를 통해서 초기화 지연, 접근제어, 로깅, 캐싱 등 가능
 *
 * 장점
 *  - 서비스로직 변경 없이 부차적인 기능을 추가할 수 있음 (OCP)
 *
 * 단점
 *  - 구조가 복잡해짐
 *
 * 사용예시
 *  - 자바 java.lang.reflect.Proxy
 *  - 스프링 AOP
 */
public class ProxyMain {
    public static void main(String[] args) throws InterruptedException {
        // proxy객체에 타겟서비스(real subject)를 참조할수있도록 넘겨준다
        GameService gameService = new GameServiceProxy(new DefaultGameService());

        gameService.startGame();
    }
}
