package example.event_delegation.subject;

import example.event_delegation.even.EventHandler;
import lombok.Data;

/**
 * @author dengyang
 * @createdate 2019/11/6 0006 18:00
 */
@Data
public abstract class Subject {

    private String action;

    private EventHandler eventHandler = new EventHandler();

    public EventHandler getEventHandler(){
        return eventHandler;
    }

    public void setEventHandler(EventHandler eventHandler){
        this.eventHandler = eventHandler;
    }

    public abstract void addObserver(Object object,String methodName,Object...args);

    public abstract void notifyPeople();
}
