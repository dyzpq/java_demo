package example.decorator;

import example.component.Person;

/**
 * @author dengyang
 * @createdate 2019/11/5 0005 14:55
 */
public abstract class Finery extends Person {

    protected Person component;

    public void setPerson(Person component){
        this.component = component;
    }

    @Override
    public void show(){
        if(null != component){
            component.show();
        }
    }
}
