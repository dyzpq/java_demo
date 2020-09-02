package template;

import template.component.Impl.ComponentImpl;
import template.decorator.ConcreteDecoratorA;
import template.decorator.ConcreteDecoratorB;

/**
 * @author dengyang
 * @createdate 2019/11/5 0005 14:43
 */
public class main {
    public static void main(String[] args) {
        ComponentImpl component = new ComponentImpl();
        ConcreteDecoratorA concreteDecoratorA = new ConcreteDecoratorA();
        ConcreteDecoratorB concreteDecoratorB = new ConcreteDecoratorB();


        concreteDecoratorA.setComponent(component);
        concreteDecoratorB.setComponent(concreteDecoratorA);
        concreteDecoratorB.Operation();
    }
}
