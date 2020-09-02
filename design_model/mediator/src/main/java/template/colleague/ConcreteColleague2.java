package template.colleague;

import template.mediator.Mediator;

/**
 * @author dengyang
 * @createdate 2019/11/15 0015 16:31
 */
public class ConcreteColleague2 extends Colleague {

    public ConcreteColleague2(Mediator mediator) {
        super(mediator);
    }

    public void send(String message){
        mediator.send(message,this);
    }

    public void notifyPeople(String message){
        System.out.println("同事2得到消息："+message);
    }
}
