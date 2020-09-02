package template.state;

import template.context.Context;

/**
 * @author dengyang
 * @createdate 2019/11/7 0007 15:00
 */
public class ConcreteStateB extends State {
    @Override
    public void Handle(Context context) {
        context.setState(new ConcreteStateA());
    }
}
