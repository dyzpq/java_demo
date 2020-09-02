package example.factory;

import example.product.Operation;
import example.product.OperationAdd;

/**
 * @author dengyang
 * @createdate 2019/11/5 0005 16:49
 */
public class FactoryAdd implements Factory {
    @Override
    public Operation factoryMethod() {
        return new OperationAdd();
    }
}
