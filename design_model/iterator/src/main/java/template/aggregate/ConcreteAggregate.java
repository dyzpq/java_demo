package template.aggregate;

import template.iterator.ConcreteIterator;
import template.iterator.Iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author dengyang
 * @createdate 2019/11/8 0008 11:59
 */
public class ConcreteAggregate extends Aggregate {

    private List<Object> items = new ArrayList<>();

    @Override
    public Iterator createIterator() {
        return new ConcreteIterator(this);
    }

    public int count(){
        return items.size();
    }

    public Object getItem(int index){
        return items.get(index);
    }

    public void setItem(int index,Object o){
        items.add(index,o);
    }

    public List<Object> getItems(){
        return this.items;
    }
}
