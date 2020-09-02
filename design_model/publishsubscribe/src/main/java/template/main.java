package template;

import template.observer.ConcreteObserver;
import template.subject.ConcreteSubject;

/**
 * @author dengyang
 * @createdate 2019/11/6 0006 16:03
 */
public class main {
    public static void main(String[] args) {
        ConcreteSubject s = new ConcreteSubject();

        s.attach(new ConcreteObserver(s,"X"));
        s.attach(new ConcreteObserver(s,"Y"));
        s.attach(new ConcreteObserver(s,"Z"));

        s.setSubjectState("ABC");
        s.notifyPeople();
    }
}
