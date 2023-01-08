package 행동패턴.chainOfResponsibility;

/**
 * 책임연쇄 패턴
 *  - 요청을 보내는쪽과 처리하는쪽을 분리 (결합도 제거)
 *  - 특정 책임에 대한 처리 주체를 하나의 객체에 국한시키지 않고 여러 객체를 통해서 처리할 수 있도록 함
 *  - client가 구체 핸들러 타입을 모르도록 추상화
 *
 * 장점
 *  - client 코드 변경 없이 새로운 handler를 chain에 추가 가능 (OCP)
 *  - handler별로 단일 책임을 가짐 (SRP)
 *  - chain에 대한 조합을 자유롭게 가져갈 수 있음
 *
 * 단점
 *  - 구조 특성상 디버깅이 복잡함
 *
 * 사용예시
 *  - 자바 servlet filter
 *  - 스프링 시큐리티 WebSecurityConfigurerAdapter에서의 컨피그 체이닝
 */
public class ChainOfResponsibilityMain {
    public static void main(String[] args) {

        //client로 완성된 책임 chain을 넘긴다
        RequestHandler handlerChain = new AuthRequestHandler(new LoggingRequestHandler(new PrintRequestHandler(null)));

        // client는 자신이 어떤 handler를 사용할지 결정하지 않음
        Client client = new Client(handlerChain);
        client.doWork();
    }
}
