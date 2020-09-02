package example.strategy;

/**
 * @author dengyang
 * @createdate 2019/11/5 0005 11:53
 */
public class CashReturn extends CashSuper {

    /**
     * 满多少减
     */
    private double moneyCondition;

    /**
     * 减多少
     */
    private double moneyReturn;

    public CashReturn(String moneyCondition,String moneyReturn){
        this.moneyCondition = Double.valueOf(moneyCondition);
        this.moneyReturn = Double.valueOf(moneyReturn);
    }
    @Override
    public double acceptCash(double money) {
        if(money >= moneyCondition){
            money = (money/moneyCondition)*moneyReturn;
        }
        return money;
    }
}
