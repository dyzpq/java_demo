package example.colleague;

import example.mediator.UnitedNations;

/**
 * @author dengyang
 * @createdate 2019/11/15 0015 16:51
 */
public abstract class Country {

    protected UnitedNations mediator;

    public Country(UnitedNations mediator){
        this.mediator = mediator;
    }
}
