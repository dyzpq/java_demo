package example.observer;

import example.subject.Subject;

/**
 * @author dengyang
 * @createdate 2019/11/6 0006 16:51
 */
public class NBAObserver extends Observer {

    public NBAObserver(String name, Subject subject){
        super(name,subject);
    }

    @Override
    public void update() {
        System.out.println(subject.getAction()+","+name+"关闭NBA直播，继续工作！");
    }
}
