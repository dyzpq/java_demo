package template.context;

import lombok.Data;
import template.srategy.Strategy;

/**
 * @author dengyang
 * @createdate 2019/11/5 0005 11:31
 * 策略模式
 */
@Data
public class Context {

    private Strategy strategy;

    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    public void ContextInterface(){
        strategy.algorithmInterface();
    }
}
