package example.handler;

import example.request.Request;
import lombok.Setter;

/**
 * @author dengyang
 * @createdate 2019/11/15 0015 15:52
 */
@Setter
public abstract class Manager {
    protected String name;
    protected Manager superior;

    public Manager(String name){
        this.name = name;
    }

    public abstract void requestApplications(Request request);
}
