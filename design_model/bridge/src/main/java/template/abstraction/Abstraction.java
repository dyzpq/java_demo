package template.abstraction;

import lombok.Setter;
import template.implementor.Implementor;

/**
 * @author dengyang
 * @createdate 2019/11/15 0015 14:36
 */
@Setter
public class Abstraction {

    protected Implementor implementor;


    public void operation(){
        implementor.operation();
    }
}
