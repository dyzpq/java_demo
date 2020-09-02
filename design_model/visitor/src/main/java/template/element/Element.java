package template.element;

import template.visitor.Visitor;

/**
 * @author dengyang
 * @createdate 2019/11/20 0020 10:09
 */
public abstract class Element {
    public abstract void accept(Visitor visitor);
}
