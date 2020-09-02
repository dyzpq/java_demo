package example;

import example.factory.OperationFactory;
import example.operation.Operation;

/**
 * @author dengyang
 * @createdate 2019/11/5 0005 10:36
 */
public class main {
    public static void main(String[] args) {
        Operation oper;

        oper= OperationFactory.createOperation("+");
        oper.setNumble1(2);
        oper.setNumble2(3);
        System.out.println(oper.getResult());

        oper= OperationFactory.createOperation("-");
        oper.setNumble1(2);
        oper.setNumble2(3);
        System.out.println(oper.getResult());

        oper= OperationFactory.createOperation("*");
        oper.setNumble1(2);
        oper.setNumble2(3);
        System.out.println(oper.getResult());

        oper= OperationFactory.createOperation("/");
        oper.setNumble1(2);
        oper.setNumble2(3);
        System.out.println(oper.getResult());


    }
}
