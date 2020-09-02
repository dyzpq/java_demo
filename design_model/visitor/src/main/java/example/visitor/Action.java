package example.visitor;

import example.element.Man;
import example.element.Woman;

/**
 * @author dengyang
 * @createdate 2019/11/20 0020 10:27
 */
public abstract class Action {
    public abstract void getManConclusion(Man elementA);
    public abstract void getWomenConclusion(Woman elementB);
}
