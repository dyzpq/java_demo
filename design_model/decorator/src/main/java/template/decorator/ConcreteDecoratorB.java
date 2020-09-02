package template.decorator;


/**
 * @author dengyang
 * @createdate 2019/11/5 0005 14:40
 */
public class ConcreteDecoratorB extends Decorator {

    @Override
    public void Operation(){
        super.Operation();
        addedBehaviour();
        System.out.println("具体装饰对象B的操作");
    }

    private void addedBehaviour(){
        System.out.println("具体装饰对象B addedBehaviour");
    }
}
