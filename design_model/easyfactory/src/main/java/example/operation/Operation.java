package example.operation;


import lombok.Data;

/**
 * @author dengyang
 * @createdate 2019/11/5 0005 10:44
 */
@Data
public abstract class Operation {

    double numble1;
    double numble2;

    public abstract double getResult();

}
