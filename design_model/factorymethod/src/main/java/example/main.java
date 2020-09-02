package example;

import example.factory.*;
import example.product.Operation;

/**
 * @author dengyang
 * @createdate 2019/11/5 0005 16:52
 */
public class main {
    public static void main(String[] args) {
        Factory factory;
        Operation oper;

        factory = new FactoryAdd();
        oper = factory.factoryMethod();
        oper.setNumble1(2);
        oper.setNumble2(4);
        System.out.println(oper.getResult());

        factory = new FactorySub();
        oper = factory.factoryMethod();
        oper.setNumble1(2);
        oper.setNumble2(4);
        System.out.println(oper.getResult());


        factory = new FactoryMul();
        oper = factory.factoryMethod();
        oper.setNumble1(2);
        oper.setNumble2(4);
        System.out.println(oper.getResult());


        factory = new FactoryDiv();
        oper = factory.factoryMethod();
        oper.setNumble1(2);
        oper.setNumble2(4);
        System.out.println(oper.getResult());
    }
}
