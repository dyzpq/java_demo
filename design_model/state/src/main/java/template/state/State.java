package template.state;

import template.context.Context;

/**
 * @author dengyang
 * @createdate 2019/11/7 0007 14:59
 */
public abstract class State {
    public abstract void Handle(Context context);
}
