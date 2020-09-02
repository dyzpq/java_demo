package template.builder;

import template.product.Product;

/**
 * @author dengyang
 * @createdate 2019/11/6 0006 11:53
 */
public class ConcreteBuilder1 extends Builder {
   private Product product = new Product();

    @Override
    public void buildPartA() {
        product.add("部件A");
    }

    @Override
    public void buildPartB() {
        product.add("部件B");
    }

    @Override
    public Product getResult() {
        return product;
    }
}
