package template;

import template.context.Context;
import template.state.ConcreteStateA;

/**
 * @author dengyang
 * @createdate 2019/11/7 0007 15:06
 */
public class main {
    public static void main(String[] args) {
        Context c = new Context(new ConcreteStateA());

        c.Request();
        c.Request();
        c.Request();
        c.Request();
    }
}
