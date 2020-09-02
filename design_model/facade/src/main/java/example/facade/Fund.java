package example.facade;

import example.subsystem.*;

/**
 * @author dengyang
 * @createdate 2019/11/6 0006 11:17
 */
public class Fund {
    Stock1 stock1;
    Stock2 stock2;
    Stock3 stock3;
    Reakty1 reakty1;
    NationalDebt1 nationalDebt1;

    public Fund(){
        stock1 = new Stock1();
        stock2 = new Stock2();
        stock3 = new Stock3();
        reakty1 = new Reakty1();
        nationalDebt1 = new NationalDebt1();
    }

    public void buyFund(){
        stock1.buy();
        stock2.buy();
        stock3.buy();
        reakty1.buy();
        nationalDebt1.buy();
    }

    public void sellFund(){
        stock1.sell();
        stock2.sell();
        stock3.sell();
        reakty1.sell();
        nationalDebt1.sell();
    }
}
