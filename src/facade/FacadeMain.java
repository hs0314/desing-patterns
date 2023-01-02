package facade;

/**
 * 파사드 패턴
 *  - 복잡한 서브 시스템 의존성(ex. 라이브러리 등)을 최소화하는 방법
 *  - client가 사용해야하는 복잡한 의존성 앞에 간단한 인터페이스(Facade)를 둠으로써 추상화 할 수 있음
 *
 * 장점
 *  - 서브시스템의 의존성을 한 곳에서 관리할 수 있음
 *
 * 단점
 *  - 결국 facade 인터페이스가 최종적으로 의존성을 그대로 다시 가지게 되므로.. 디자인패턴 적용 이후에도 구조가 크게 달라지지 않을 수 있음
 */
public class FacadeMain {

    public static void main(String[] args) {

        // 각 인스턴스 간의 의존관계 등 상관없이, javax.mail 라이브러리를 알지 못해도 앞단의 인터페이스를 통해서 추상화 가능
        EmailSettings settings = new EmailSettings();
        settings.setHost("127.0.0.1");

        EmailSender sender = new EmailSender(settings);
        EmailMessage message = new EmailMessage();

        message.setFrom("from");
        message.setTo("to");
        message.setSubject("title");
        message.setText("body");

        sender.sendEmail(message);
    }
}
