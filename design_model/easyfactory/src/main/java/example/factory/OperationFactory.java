package example.factory;

import example.operation.*;

/**
 * @author dengyang
 * @createdate 2019/11/5 0005 10:58
 * 简单工厂模式
 */
public class OperationFactory {
    public static Operation createOperation(String operate){
        Operation oper = null;
        switch (operate){
            case "+":
                oper = new OperationAdd();
                break;
            case "-":
                oper = new OperationSub();
                break;
            case "*":
                oper = new OperationMul();
                break;
            case "/":
                oper = new OperationDiv();
                break;
        }
        return oper;
    }
}
