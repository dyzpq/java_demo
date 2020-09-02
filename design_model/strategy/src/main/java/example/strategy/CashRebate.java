package example.strategy;

/**
 * @author dengyang
 * @createdate 2019/11/5 0005 11:50
 */
public class CashRebate extends CashSuper {

    /**
     * 打折率
     */
    private double moneyRebate;

    public CashRebate(String moneyRebate){
        this.moneyRebate = Double.valueOf(moneyRebate);
    }

    @Override
    public double acceptCash(double money) {
        return money * moneyRebate;
    }
}
