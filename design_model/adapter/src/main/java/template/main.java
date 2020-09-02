package template;

import template.adapter.Adapter;
import template.targer.Target;

/**
 * @author dengyang
 * @createdate 2019/11/7 0007 16:00
 */
public class main {
    public static void main(String[] args) {
        Target target = new Adapter();
        target.request();
    }
}
