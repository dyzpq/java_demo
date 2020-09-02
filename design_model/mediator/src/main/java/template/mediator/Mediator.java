package template.mediator;

import template.colleague.Colleague;

/**
 * @author dengyang
 * @createdate 2019/11/15 0015 16:19
 */
public abstract class Mediator {
    public abstract void send(String message, Colleague colleague);
}
