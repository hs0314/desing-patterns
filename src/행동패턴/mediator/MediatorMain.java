package 행동패턴.mediator;

/**
 * 중재자 패턴
 *  - 여러 객체간의 의사소통 방식을 추상화 시켜서 각 객체간의 결합도를 낮추는 패턴
 *  - 다른 객체끼리 서로 참조하지 않고 Mediator를 통해서 소통
 *
 *  사용예시
 *   - 스프링 DispatcherServlet
 *     DispatcherServlet에서 필요한 handler, adapter, resolver 등 여러 컴포넌트에 대한 메시지를 한 곳에서 관리
 */
public class MediatorMain {
    public static void main(String[] args) {
        FrontDesk frontDesk = new FrontDesk();

        // 순환참조 방지를 위해서, 객체 생성시점에 Mediator객체에 객체(guest, cleaningService) 주입
        Guest guest = new Guest(frontDesk);
        CleaningService cleaningService = new CleaningService(frontDesk);

        guest.getTowers(5);
    }
}
