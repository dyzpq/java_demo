package example.event_delegation.subject;

import lombok.Data;

/**
 * @author dengyang
 * @createdate 2019/11/6 0006 18:10
 */
@Data
public class Secretary extends  Subject{

    private String action;

    @Override
    public void addObserver(Object object, String methodName, Object... args) {
        this.getEventHandler().addEvent(object,methodName,args);
    }

    @Override
    public void notifyPeople() {
        try {
            this.getEventHandler().notifyX();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
