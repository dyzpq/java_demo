package template.builder;

import template.product.Product;

/**
 * @author dengyang
 * @createdate 2019/11/6 0006 11:52
 */
public abstract class Builder {

    public abstract void buildPartA();
    public abstract void buildPartB();
    public abstract Product getResult();
}
