package example.product;

/**
 * @author dengyang
 * @createdate 2019/11/5 0005 16:45
 */
public class OperationDiv extends Operation {
    @Override
    public double getResult() {
        if(numble2 == 0){
            throw new RuntimeException("除数不能为0");
        }
        return numble1/numble2;
    }
}
