package template.element;

import template.visitor.Visitor;

/**
 * @author dengyang
 * @createdate 2019/11/20 0020 10:11
 */
public class ConcreteElementB extends Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visitConcreteElementB(this);
    }
    public void operationAB(){}
}
