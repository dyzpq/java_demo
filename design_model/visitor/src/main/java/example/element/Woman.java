package example.element;

import example.visitor.Action;

/**
 * @author dengyang
 * @createdate 2019/11/20 0020 10:29
 */
public class Woman extends Person {
    @Override
    public void accept(Action visitor) {
        visitor.getWomenConclusion(this);
    }
}
