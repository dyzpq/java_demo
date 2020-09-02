package example.observer;

import example.subject.Subject;

/**
 * @author dengyang
 * @createdate 2019/11/6 0006 16:37
 */
public abstract class Observer {
    protected String name;
    protected Subject subject;

    public Observer(String name,Subject subject){
        this.name = name;
        this.subject = subject;
    }

    public abstract void update();
}
