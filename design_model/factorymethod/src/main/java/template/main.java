package template;

import template.factory.Creator;
import template.factory.CreatorImpl;
import template.product.Product;

/**
 * @author dengyang
 * @createdate 2019/11/5 0005 16:35
 */
public class main {
    public static void main(String[] args) {
        Creator creator = new CreatorImpl();

        Product product = creator.factoryMethod();
        product.getResult();
    }
}
