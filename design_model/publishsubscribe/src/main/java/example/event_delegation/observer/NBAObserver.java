package example.event_delegation.observer;

import example.event_delegation.subject.Subject;

/**
 * @author dengyang
 * @createdate 2019/11/6 0006 18:13
 */
public class NBAObserver {

    private String name;
    private Subject subject;
    private String observerState;

    public NBAObserver(String name,Subject subject){
        this.name = name;
        this.subject = subject;
    }

    public void closeNBADirectSeeding() {
        observerState = subject.getAction();
        System.out.println(observerState+","+name+"关闭NBA直播，继续工作！");
    }
}
