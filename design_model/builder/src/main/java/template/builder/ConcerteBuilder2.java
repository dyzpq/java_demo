package template.builder;

import template.product.Product;

/**
 * @author dengyang
 * @createdate 2019/11/6 0006 11:55
 */
public class ConcerteBuilder2 extends Builder{
    private Product product = new Product();


    @Override
    public void buildPartA() {
        product.add("部件X");
    }

    @Override
    public void buildPartB() {
        product.add("部件Y");
    }

    @Override
    public Product getResult() {
        return product;
    }
}
