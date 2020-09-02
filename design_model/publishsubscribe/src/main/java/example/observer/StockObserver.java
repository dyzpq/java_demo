package example.observer;

import example.subject.Subject;

/**
 * @author dengyang
 * @createdate 2019/11/6 0006 16:44
 */
public class StockObserver extends Observer {

    public StockObserver(String name, Subject subject){
        super(name,subject);
    }

    @Override
    public void update() {
        System.out.println(subject.getAction()+","+name+"关闭股票行情，继续工作！");
    }
}
