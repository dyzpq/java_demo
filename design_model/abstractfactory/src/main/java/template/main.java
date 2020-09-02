package template;

import template.factory.AbstractFactory;
import template.factory.ConcreteFactory1;
import template.factory.ConcreteFactory2;
import template.product.AbstractProductA;
import template.product.AbstractProductB;

/**
 * @author dengyang
 * @createdate 2019/11/7 0007 11:47
 */
public class main {
    public static void main(String[] args) {
        AbstractFactory factory;

        factory = new ConcreteFactory1();
        AbstractProductA productA1 = factory.createProductA();
        AbstractProductB productB1 = factory.createProductB();
        productA1.show();
        productB1.show();

        factory = new ConcreteFactory2();
        AbstractProductA productA2 = factory.createProductA();
        AbstractProductB productB2= factory.createProductB();
        productA2.show();
        productB2.show();
    }
}
