package template;

import template.facade.Facade;

/**
 * @author dengyang
 * @createdate 2019/11/6 0006 11:04
 */
public class main {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.methodA();
        facade.methodB();
    }
}
