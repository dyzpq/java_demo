package template.component.Impl;

import template.component.Component;

/**
 * @author dengyang
 * @createdate 2019/11/5 0005 14:30
 */
public class ComponentImpl implements Component {
    @Override
    public void Operation() {
        System.out.println("具体实现类");
    }
}
