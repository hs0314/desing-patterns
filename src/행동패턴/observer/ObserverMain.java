package 행동패턴.observer;

/**
 * 옵저버 패턴
 *  - Subject의 특정의 상태의 변화를 감지하는 옵저버 목록을 객체에 등록하여 변화가 있을 때마다 옵저버에게 통지하도록 하는 디자인 패턴
 *  - pub/sub 패턴
 *
 * 장점
 *  - 상태를 변하는 객체(subject), 변경을 감지하는 객체(observer)의 관계를 느슨하게 가져갈 수 있음
 *  - Subject의 상태를 주기적으로 체크하지 않아도 변경을 감지할 수 있음
 *  - 런타임에 observer를 추가/삭제 할 수 있다.
 *
 * 단점
 *  - 다수의 observer 등록 이후 해지하지 않는다면 미사용 인스턴스가 Map에 쌓이면서 Memory leak 발생
 *    - 명시적 해지, WeakReference 등을 통해서 해결
 *
 * 사용예시
 *  - 자바 Observer 인터페이스, Observable 클래스 (자바9부터 deprecated 됌)
 *  - 자바 PropertyChangeListener
 *  - 자바 Flow API
 *  - Spring ApplicationContext(IoC 컨테이너)
 *      - ApplicationEventPublisher, @EventListener
 */
public class ObserverMain {

    public static void main(String[] args) {
        ChatServer chatServer = new ChatServer();

        User user1 = new User("user1");
        User user2 = new User("user2");

        chatServer.register("subject1", user1);
        chatServer.register("subject2", user1);
        chatServer.register("subject1", user2);

        // sendMessage를 통한 chatServer 상태 변경 -> chatServer(Subject)를 보는 옵저버 객체(Subscriber0의 특정 메서드 호출
        chatServer.sendMessage(user1, "subject1", "subjet1 new message");
        chatServer.sendMessage(user2, "subject2", "subjet2 new message");
    }
}
