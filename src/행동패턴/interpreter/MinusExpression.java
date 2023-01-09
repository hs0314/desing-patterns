package 행동패턴.interpreter;

import java.util.Map;

// non-terminal expression
public class MinusExpression implements PostfixExpression{

    private PostfixExpression left, right;

    public MinusExpression(PostfixExpression left, PostfixExpression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret(Map<Character, Integer> context) {
        return left.interpret(context) - right.interpret(context);
    }
}
