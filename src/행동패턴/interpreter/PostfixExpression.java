package 행동패턴.interpreter;

import java.util.Map;

public interface PostfixExpression {
    int interpret(Map<Character, Integer> context);

    // 자바8부터 interface에서 static 메서드를 가질 수 있음
    // 이 static 메서드를 사용하면 plus, minus, variable에 대한 구현체가 없어도 됌
    static PostfixExpression plus(PostfixExpression left, PostfixExpression right){
        return context -> left.interpret(context) + right.interpret(context);
    }
    static PostfixExpression minus(PostfixExpression left, PostfixExpression right){
        return context -> left.interpret(context) - right.interpret(context);
    }
    static PostfixExpression variable(Character c){
        return context -> context.get(c);
    }

}
