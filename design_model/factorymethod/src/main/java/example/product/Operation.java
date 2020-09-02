package example.product;

import lombok.Data;

/**
 * @author dengyang
 * @createdate 2019/11/5 0005 16:39
 */
@Data
public abstract class Operation {

    protected double numble1;

    protected double numble2;

    public abstract double getResult();
}
