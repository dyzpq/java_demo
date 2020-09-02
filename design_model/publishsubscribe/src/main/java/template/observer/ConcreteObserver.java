package template.observer;

import template.subject.ConcreteSubject;
import lombok.Data;

/**
 * @author dengyang
 * @createdate 2019/11/6 0006 15:55
 */
@Data
public class ConcreteObserver extends Observer {

    private String name;
    private String observerState;
    private ConcreteSubject subject;

    public ConcreteObserver(ConcreteSubject subject,String name){
        this.name = name;
        this.subject = subject;
    }

    @Override
    public void update() {
        observerState = subject.getSubjectState();
        System.out.println("观察者"+name+"的最新状态是"+observerState);
    }

}
