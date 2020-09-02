package template;

import template.caretaker.Caretaker;
import template.originator.Originator;

/**
 * @author dengyang
 * @createdate 2019/11/7 0007 17:11
 */
public class main {
    public static void main(String[] args) {
        Originator o = new Originator();
        o.setState("On");
        o.show();

        Caretaker c = new Caretaker();
        c.setMemento(o.createMemento());

        o.setState("off");
        o.show();

        o.setMemento(c.getMemento());
        o.show();
    }
}
