package template.factory;

import template.product.Product;
import template.product.ProductImpl;

/**
 * @author dengyang
 * @createdate 2019/11/5 0005 16:32
 */
public class CreatorImpl implements Creator {

    @Override
    public Product factoryMethod() {
        return new ProductImpl();
    }
}
