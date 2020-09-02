package template.expression;

import template.context.Context;

/**
 * @author dengyang
 * @createdate 2019/11/18 0018 15:26
 */
public class NonterminalExpression extends AbstractExpression {
    @Override
    public void interpret(Context context) {
        System.out.println("非终端解释器");
    }
}
