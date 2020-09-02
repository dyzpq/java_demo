package template.factory;

import template.product.AbstractProductA;
import template.product.AbstractProductB;
import template.product.ProductA2;
import template.product.ProductB2;

/**
 * @author dengyang
 * @createdate 2019/11/7 0007 11:41
 */
public class ConcreteFactory2 implements AbstractFactory {
    @Override
    public AbstractProductA createProductA() {
        return new ProductA2();
    }

    @Override
    public AbstractProductB createProductB() {
       return new ProductB2();
    }
}
