package template.mediator;

import lombok.Setter;
import template.colleague.Colleague;
import template.colleague.ConcreteColleague1;
import template.colleague.ConcreteColleague2;

/**
 * @author dengyang
 * @createdate 2019/11/15 0015 16:21
 */
@Setter
public class ConcreteMediator extends Mediator {

    private ConcreteColleague1 colleague1;
    private ConcreteColleague2 colleague2;

    @Override
    public void send(String message, Colleague colleague) {
        if(colleague.equals(colleague1)){
            colleague2.notifyPeople(message);
        }else {
            colleague1.notifyPeople(message);
        }
    }
}
