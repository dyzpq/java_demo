package example.factory;

import example.product.Operation;
import example.product.OperationMul;

/**
 * @author dengyang
 * @createdate 2019/11/5 0005 16:51
 */
public class FactoryMul implements Factory{

    @Override
    public Operation factoryMethod() {
        return new OperationMul();
    }
}
