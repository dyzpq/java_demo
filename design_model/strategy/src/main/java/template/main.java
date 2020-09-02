package template;

import template.context.Context;
import template.srategy.ConcreteStrategyA;
import template.srategy.ConcreteStrategyB;
import template.srategy.ConcreteStrategyC;

/**
 * @author dengyang
 * @createdate 2019/11/5 0005 11:33
 */
public class main {

    public static void main(String[] args) {
        Context context;
        context = new Context(new ConcreteStrategyA());
        context.ContextInterface();

        context = new Context(new ConcreteStrategyB());
        context.ContextInterface();

        context = new Context(new ConcreteStrategyC());
        context.ContextInterface();
    }
}
