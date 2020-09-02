package template.colleague;

import template.mediator.Mediator;

/**
 * @author dengyang
 * @createdate 2019/11/15 0015 16:20
 */
public abstract class Colleague {

    protected Mediator mediator;

    public Colleague(Mediator mediator){
        this.mediator = mediator;
    }


}
