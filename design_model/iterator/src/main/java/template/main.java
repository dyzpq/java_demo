package template;

import template.aggregate.ConcreteAggregate;
import template.iterator.ConcreteIterator;
import template.iterator.Iterator;

/**
 * @author dengyang
 * @createdate 2019/11/8 0008 12:09
 */
public class main {
    public static void main(String[] args) {
        ConcreteAggregate a = new ConcreteAggregate();
        a.setItem(0,"大鸟");
        a.setItem(1,"小菜");
        a.setItem(2,"行李");
        a.setItem(3,"老外");
        a.setItem(4,"小偷");

        Iterator i = new ConcreteIterator(a);
        while (!i.isDone()){
            System.out.println(i.currentItem()+" 请买车票");
            i.next();
        }
    }
}
