package example.event_delegation;

import example.event_delegation.observer.NBAObserver;
import example.event_delegation.observer.StockObserver;
import example.event_delegation.subject.Secretary;

/**
 * @author dengyang
 * @createdate 2019/11/6 0006 18:20
 */
public class main {
    public static void main(String[] args) {
        Secretary secretary = new Secretary();
        secretary.setAction("老板回来了");

        StockObserver stockObserver = new StockObserver("张三",secretary);
        NBAObserver nbaObserver = new NBAObserver("李四",secretary);

        secretary.addObserver(nbaObserver,"closeNBADirectSeeding");
        secretary.addObserver(stockObserver,"closeStockMarket");
        secretary.notifyPeople();
    }
}
