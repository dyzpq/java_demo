package example.element;

import example.visitor.Action;

/**
 * @author dengyang
 * @createdate 2019/11/20 0020 10:29
 */
public class Man extends Person {
    @Override
    public void accept(Action visitor) {
        visitor.getManConclusion(this);
    }
}
