package 행동패턴.visitor;

/**
 * 방문자 패턴
 *  - 기존 코드를 변경시키지 않고 기능을 추가 할때 사용
 *  - element에서 visitor(기능 모음)에 자신의 타입을 넘겨주고 visitor는 element 타입별 메서드 오버로딩을 통해서
 *    적절한 메서드에 디스패치 한다.
 *
 * 장점
 *  - 기존 코드(element) 수정없이 기능 추가 가능
 *
 * 단점
 *  - element의 추가/삭제 등이 발생 시, concrete visitor가 모두 수정 필요
 *
 * 사용 예시
 *  - 자바 FileVisitor
 */
public class VisitorMain {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle();
        Device device = new Phone();

        rectangle.accept(device);
    }
}
