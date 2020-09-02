package example;

import example.adapter.Translator;
import example.targer.Center;
import example.targer.Forwards;
import example.targer.Player;

/**
 * @author dengyang
 * @createdate 2019/11/7 0007 16:16
 */
public class main {
    public static void main(String[] args) {
        Player a = new Forwards("巴蒂尔");
        a.attack();

        Player b = new Center("加索尔");
        b.attack();

        Player c = new Translator("姚明");
        c.attack();
        c.defense();
    }
}
