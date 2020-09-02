package example;

import example.observer.NBAObserver;
import example.observer.StockObserver;
import example.subject.Boss;
import example.subject.Secretary;
import example.subject.Subject;

/**
 * @author dengyang
 * @createdate 2019/11/6 0006 16:53
 */
public class main {
    public static void main(String[] args) {
        Subject s;

        //秘书通知
        s = new Secretary();
        s.attch(new NBAObserver("张三",s));
        s.attch(new StockObserver("李四",s));
        s.attch(new NBAObserver("王五",s));

        s.setAction("老板回来了");
        s.notyfyPeople();

        //老板通知
        s = new Boss();
        s.attch(new NBAObserver("张三",s));
        s.attch(new StockObserver("李四",s));
        s.attch(new NBAObserver("王五",s));

        s.setAction("老板回来了");
        s.notyfyPeople();
    }
}
