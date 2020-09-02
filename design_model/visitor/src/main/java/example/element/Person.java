package example.element;

import example.visitor.Action;

/**
 * @author dengyang
 * @createdate 2019/11/20 0020 10:28
 */
public abstract class Person {
    public abstract void accept(Action visitor);
}
