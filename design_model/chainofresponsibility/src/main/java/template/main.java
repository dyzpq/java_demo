package template;

import template.handler.ConcreteHandler1;
import template.handler.ConcreteHandler2;
import template.handler.ConcreteHandler3;
import template.handler.Handler;

/**
 * @author dengyang
 * @createdate 2019/11/15 0015 15:48
 */
public class main {
    public static void main(String[] args) {
        Handler h1 = new ConcreteHandler1();
        Handler h2 = new ConcreteHandler2();
        Handler h3 = new ConcreteHandler3();
        h1.setSuccerssor(h2);
        h2.setSuccerssor(h3);

        int[] requests = {2,5,14,22,18,3,27,20};
        for (int request : requests) {
            h1.handleRequest(request);
        }
    }
}
