package example;

import example.facade.Fund;

/**
 * @author dengyang
 * @createdate 2019/11/6 0006 11:13
 */
public class main {
    public static void main(String[] args) {
        Fund fund = new Fund();
        fund.buyFund();
        fund.sellFund();
    }
}
