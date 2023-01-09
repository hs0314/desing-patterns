package 행동패턴.interpreter;

import java.util.Map;

/**
 * 인터프리터 패턴
 *  - 자주 등장하는 문제를 간단한 언어, 표현식으로 정의하고 재사용 하는 패턴 ex) 정규표현식, DSL
 *  - context(모든 exp에서 사용하는 공통 정보), expression 인터페이스(terminal, non-terminal)
 *     ex) (1+2) 수식을 (X+Y)로 정의하고 사용한다고 할 때 X,Y는 terminal이고 +연산은 non-terminal로 볼 수 있음
 *  - 컴포짓 패턴과 유사한 구조를 가짐 (트리 구조 - abstract syntax tree)
 *
 * 장점
 *  - 반복되는 문제 패턴을 정형화된 언어/표현식으로 표현 가능
 *  - 기존코드 변경 없이 새로운 expression 추가 가능 (SRP, OCP)
 *
 * 단점
 *  - 구조의 복잡도 증가
 *
 * 사용 예시
 *  - 자바 Pattern.matches() -> 정규표현식
 *  - 스프링 Spel(Spring expression language), SpelExpressionParser
 */
public class InterpreterMain {

    public static void main(String[] args) {
        PostfixExpression expression = PostfixParser.parse("xyz+-");
        Map<Character, Integer> context = Map.of('x',1,'y',2,'z',3); //

        // expression(abstract syntax tree)에 대해서 context를 통한 실제 계산은 여기서 처리
        int result = expression.interpret(context);
        System.out.println(result);
    }
}
