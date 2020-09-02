package template.flyweightfactory;

import template.flyweigth.ConcreteFlyweigth;
import template.flyweigth.Flyweigth;

import java.util.Hashtable;

/**
 * @author dengyang
 * @createdate 2019/11/15 0015 17:11
 */
public class FlyweightFactory {

    private Hashtable flyweights = new Hashtable();

    public FlyweightFactory(){
        flyweights.put("X",new ConcreteFlyweigth());
        flyweights.put("Y",new ConcreteFlyweigth());
        flyweights.put("Z",new ConcreteFlyweigth());
    }

    public Flyweigth getFlyweigth(String key){
        return (Flyweigth)flyweights.get(key);
    }
}
