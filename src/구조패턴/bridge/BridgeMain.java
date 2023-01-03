package 구조패턴.bridge;

/**
 * 브릿지 패턴
 *  - 추상적인 것과 구체적인 것을 분리해서 연결하는 패턴 (하나의 계층구조보다 abstraction, implementation으로
 *    나누었을때 독립적인 계층 구조로 발전 시킬 수 있음)
 *  - client는 추상적 계층구조만을 사용하고 implementation을 직접 사용하지 않음
 *
 * 장점
 *  - 추상/구체 를 분리함으로써 추상적인 코드의 변경 없이 확장 가능 (OCP)
 *  - 기존의 하나의 큰 계층구조에서 추상/구체를 구분함으로써 각 객체의 역할 명확히 분리 (SRP)
 *
 * 단점
 *  - 분리된 계층 구조가 늘어나서 복잡도가 증가할 수 있음
 *
 *  사용예시
 *   - ex) JDBC (abstraction), Driver(implemantation)
 *       -> 사용 DBMS에 따라서 Driver는 달라질 수 있지만 JDBC코드(ex. Connection, Statement) 변경은 없음
 *   - ex) Slf4j logging 구조패턴.facade
 *   - ex) 스프링 PlatformTransactionManager
 */
public class BridgeMain {
    public static void main(String[] args) {

        // client코드에서는 Champion(abstraction 계층)만 사용
        Champion KDA아리 = new 아리(new KDA스킨());

        KDA아리.move();
        KDA아리.skillQ();

        Champion 정복자아리 = new 아리(new 정복자스킨());

        정복자아리.move();
        정복자아리.skillQ();

    }
}
