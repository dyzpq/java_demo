package template.decorator;

import template.component.Component;

/**
 * @author dengyang
 * @createdate 2019/11/5 0005 14:31
 * 装饰模式
 */
public abstract class Decorator implements Component {

    protected Component component;

    public void setComponent(Component component){
        this.component = component;
    }

    @Override
    public void Operation(){
        component.Operation();
    }

}
