package template.visitor;

import template.element.ConcreteElementA;
import template.element.ConcreteElementB;

/**
 * @author dengyang
 * @createdate 2019/11/20 0020 10:07
 */
public abstract class Visitor {

    public abstract void visitConcreteElementA(ConcreteElementA elementA);
    public abstract void visitConcreteElementB(ConcreteElementB elementB);
}
