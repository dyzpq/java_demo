package template.colleague;

import template.mediator.Mediator;

/**
 * @author dengyang
 * @createdate 2019/11/15 0015 16:22
 */
public class ConcreteColleague1 extends Colleague {

    public ConcreteColleague1(Mediator mediator) {
        super(mediator);
    }

    public void send(String message){
        mediator.send(message,this);
    }

    public void notifyPeople(String message){
        System.out.println("同事1得到消息："+message);
    }
}
