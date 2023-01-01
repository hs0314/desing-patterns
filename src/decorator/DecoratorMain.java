package decorator;

/**
 * 데코레이터 패턴
 *  - 기존 코드를 변경하지 않고 부가적인 기능을 동적(런타임)으로 추가하는 패턴
 *  - client에서 호출하는 component(인터페이스)를 필드로 가지는 decorator객체가 있고, 이를 상속받는 concrete decorator 객체가
 *    각각의 부가 기능을 component의 메서드에 추가 (상속이 아닌 위임)
 *  - 구조가 컴포짓 패턴과 비슷하지만 차이점은 decorator가 한 개의 component 객체를 가지고 있다는 점
 *
 * 장점
 *  - 새로운 클래스 생성 없이 기존 기능을 조합할 수 있음 (상속으로 풀려고 하면 처리하려고 하는 액션별로 신규 클래스가 필요함) (SRP)
 *  - 컴파일 타임이 아닌 런타임 시점에 동적으로 조합 가능
 *
 * 단점
 *  - concrete 데코레이터를 조합하는 소스 코드가 복잡할 수 있음
 *
 * 사용예시
 *  - HttpServletRequestWrapper
 */
public class DecoratorMain {

    private static boolean enableSpamFilter = true;
    private static boolean enableTrimming = true;

    public static void main(String[] args) {

        CommentService commentService = new DefaultCommentService();

        if(enableSpamFilter){
            commentService = new SpamFilteringDecorator(commentService);
        }
        if(enableTrimming){
            commentService = new TrimmingDecorator(commentService);
        }

        Client client = new Client(commentService);
        client.writeComment("test1");
        client.writeComment("test2...");
        client.writeComment("http://test.a");
    }
}
