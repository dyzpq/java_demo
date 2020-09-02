package template;

import template.element.ConcreteElementA;
import template.element.ConcreteElementB;
import template.objectstructure.ObjectStructure;
import template.visitor.ConcreteVisitor1;
import template.visitor.ConcreteVisitor2;

/**
 * @author dengyang
 * @createdate 2019/11/20 0020 10:18
 */
public class main {
    public static void main(String[] args) {
        ObjectStructure o = new ObjectStructure();
        o.attach(new ConcreteElementA());
        o.attach(new ConcreteElementB());

        ConcreteVisitor1 v1 = new ConcreteVisitor1();
        ConcreteVisitor2 v2 = new ConcreteVisitor2();

        o.accept(v1);
        o.accept(v2);
    }
}
