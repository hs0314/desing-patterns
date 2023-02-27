package 행동패턴.templateMethod;

/**
 * 템플릿 메서드 패턴
 *  - 추상클래스를 통해서 템플릿을 제공하고 이를 상속받는 구체클래스에서 구체적인 알고리즘을 제공
 *
 * 장점
 *  - 템플릿 코드를 재사용하고 중복코드를 줄일 수 있음
 *  - 템플릿 코드 변경 없이 상속을 이용해서 구체적인 알고리즘만 변경할 수 있음
 *
 * 단점
 *  - 리스코프 치환법칙을 위반할 가능성이 있음
 *    부모클래스의 특정 메서드의 의도를 자식클래스에서 무시할 수 있음
 *
 * 사용 예시
 *  - 자바 HttpServlet
 *     해당 인터페이스의 구현체에서 구현한 메서드를 서블릿 컨테이너에서 IoC를 통해 처리
 */
public class TemplateMethodMain {
    public static void main(String[] args) {

        FileProcessor fileProcessor = new Plus("number.txt");
        int result = fileProcessor.process();
        System.out.println(result);
    }
}
