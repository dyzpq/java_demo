package example.factory;

import example.product.Operation;
import example.product.OperationSub;

/**
 * @author dengyang
 * @createdate 2019/11/5 0005 16:51
 */
public class FactorySub implements Factory {
    @Override
    public Operation factoryMethod() {
        return new OperationSub();
    }
}
