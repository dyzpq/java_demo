package template.decorator;


/**
 * @author dengyang
 * @createdate 2019/11/5 0005 14:38
 */
public class ConcreteDecoratorA extends Decorator {

    private String addedState;

    @Override
    public void Operation(){
        super.Operation();
        addedState = "New State";
        System.out.println("具体装饰对象A操作");
    }
}
