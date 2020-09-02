package example.event_delegation.even;

import java.util.ArrayList;
import java.util.List;

/**
 * @author dengyang
 * @createdate 2019/11/6 0006 17:49
 */
public class EventHandler {
    private List<Event> objects;

    public EventHandler(){
        objects = new ArrayList<Event>();
    }

    public void addEvent(Object object,String methodName,Object...args){
        objects.add(new Event(object,methodName,args));
    }

    public void notifyX() throws Exception {
        for (Event event : objects) {
            event.invoke();
        }
    }
}
