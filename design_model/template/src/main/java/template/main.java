package template;

import template.template.AbstractClass;
import template.template.ConcreteClassA;
import template.template.ConcreteClassB;

/**
 * @author dengyang
 * @createdate 2019/11/6 0006 10:31
 */
public class main {
    public static void main(String[] args) {
        AbstractClass c;

        c = new ConcreteClassA();
        c.templateMethod();

        c = new ConcreteClassB();
        c.templateMethod();
    }
}
