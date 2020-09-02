package template.visitor;

import template.element.ConcreteElementA;
import template.element.ConcreteElementB;

/**
 * @author dengyang
 * @createdate 2019/11/20 0020 10:17
 */
public class ConcreteVisitor2 extends Visitor {
    @Override
    public void visitConcreteElementA(ConcreteElementA elementA) {
        System.out.println(elementA.getClass().getSimpleName()+"被"+this.getClass().getSimpleName()+"访问");
    }

    @Override
    public void visitConcreteElementB(ConcreteElementB elementB) {
        System.out.println(elementB.getClass().getSimpleName()+"被"+this.getClass().getSimpleName()+"访问");
    }
}
