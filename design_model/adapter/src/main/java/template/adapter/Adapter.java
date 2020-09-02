package template.adapter;

import template.targer.Target;

/**
 * @author dengyang
 * @createdate 2019/11/7 0007 15:59
 */
public class Adapter extends Target {

    private Adaptee adaptee = new Adaptee();

    @Override
    public void request(){
        adaptee.SpecificRequest();
    }
}
