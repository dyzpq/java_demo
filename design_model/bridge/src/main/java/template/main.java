package template;

import template.abstraction.Abstraction;
import template.abstraction.RefinedAbstraction;
import template.implementor.ConcreteImplementorA;
import template.implementor.ConcreteImplementorB;

/**
 * @author dengyang
 * @createdate 2019/11/15 0015 14:39
 */
public class main {
    public static void main(String[] args) {
        Abstraction ab = new RefinedAbstraction();

        ab.setImplementor(new ConcreteImplementorA());
        ab.operation();

        ab.setImplementor(new ConcreteImplementorB());
        ab.operation();
    }
}
