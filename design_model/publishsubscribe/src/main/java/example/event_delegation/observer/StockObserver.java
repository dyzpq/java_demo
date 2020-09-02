package example.event_delegation.observer;

import example.event_delegation.subject.Subject;

/**
 * @author dengyang
 * @createdate 2019/11/6 0006 18:17
 */
public class StockObserver {

    private String name;
    private Subject subject;
    private String observerState;

    public StockObserver(String name,Subject subject){
        this.name = name;
        this.subject = subject;
    }

    public void closeStockMarket(){
        observerState = subject.getAction();
        System.out.println(observerState+","+name+"关闭股票行情，继续工作！");
    }
}
