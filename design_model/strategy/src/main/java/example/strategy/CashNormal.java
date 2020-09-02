package example.strategy;

/**
 * @author dengyang
 * @createdate 2019/11/5 0005 11:48
 */
public class CashNormal extends CashSuper {
    @Override
    public double acceptCash(double money) {
        return money;
    }
}
