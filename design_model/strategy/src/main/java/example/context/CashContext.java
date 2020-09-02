package example.context;

import example.strategy.CashNormal;
import example.strategy.CashRebate;
import example.strategy.CashReturn;
import example.strategy.CashSuper;

/**
 * @author dengyang
 * @createdate 2019/11/5 0005 12:00
 * 策略模式与简单工厂结合
 */
public class CashContext {

    private CashSuper cashSuper;

    public CashContext(String type){
       switch (type){
           case "正常收费":
               cashSuper = new CashNormal();
               break;
           case "满300返100":
               cashSuper = new CashReturn("300","100");
               break;
           case "八折":
               cashSuper = new CashRebate("0.8");
               break;
               default:cashSuper = new CashNormal();
       }
    }

    public double getResult(double money){
        return  cashSuper.acceptCash(money);
    }
}
