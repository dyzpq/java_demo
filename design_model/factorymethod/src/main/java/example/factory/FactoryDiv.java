package example.factory;

import example.product.Operation;
import example.product.OperationDiv;

/**
 * @author dengyang
 * @createdate 2019/11/5 0005 16:50
 */
public class FactoryDiv implements Factory {
    @Override
    public Operation factoryMethod() {
        return new OperationDiv();
    }
}
