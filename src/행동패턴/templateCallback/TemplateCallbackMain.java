package 행동패턴.templateCallback;

import 행동패턴.templateCallback.FileProcessor;

/**
 * 템플릿 콜백 패턴
 *  - 템플릿 메서드와 달리 추상메서드를 사용하지 않고 Callback 인터페이스를 두고 처리를 해당 콜백의 구현체에 위임
 *  - 익명클래스를 구현하거나 람다표현식 등으로 간단하게 표현 가능
 *  - 스프링 프레임워크 내에서 많이 사용되는 패턴
 *
 * 사용 예시
 *  - JdbcTemplate (토비스프링 참고)
 *  - RestTemplate
 */
public class TemplateCallbackMain {
    public static void main(String[] args) {
        FileProcessor fileProcessor = new FileProcessor("number.txt");
        int result = fileProcessor.process((result1, number) -> result1 += Integer.valueOf(number));
        System.out.println(result);
    }
}
