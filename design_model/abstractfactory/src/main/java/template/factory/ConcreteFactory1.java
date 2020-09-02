package template.factory;


import template.product.AbstractProductA;
import template.product.AbstractProductB;
import template.product.ProductA1;
import template.product.ProductB2;

/**
 * @author dengyang
 * @createdate 2019/11/7 0007 11:39
 */
public class ConcreteFactory1 implements AbstractFactory {

    @Override
    public AbstractProductA createProductA() {
        return new ProductA1();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ProductB2();
    }


}
