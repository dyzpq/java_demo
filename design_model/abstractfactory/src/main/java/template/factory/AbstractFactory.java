package template.factory;


import template.product.AbstractProductA;
import template.product.AbstractProductB;

/**
 * @author dengyang
 * @createdate 2019/11/7 0007 11:37
 */
public interface AbstractFactory {

    AbstractProductA createProductA();
    AbstractProductB createProductB();
}
