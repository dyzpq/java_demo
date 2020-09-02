package example;

import example.context.CashContext;

/**
 * @author dengyang
 * @createdate 2019/11/5 0005 12:03
 */
public class main {

    public static void main(String[] args) {
        double total = 0;
        CashContext cashContext;

        cashContext = new CashContext("正常收费");
        total += cashContext.getResult(100);

        cashContext = new CashContext("八折");
        total += cashContext.getResult(200);

        cashContext = new CashContext("满300返100");
        total += cashContext.getResult(300);

        System.out.println("总共收费："+total);

    }

}
