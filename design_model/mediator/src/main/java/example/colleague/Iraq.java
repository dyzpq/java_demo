package example.colleague;

import example.mediator.UnitedNations;

/**
 * @author dengyang
 * @createdate 2019/11/15 0015 16:55
 */
public class Iraq extends Country {

    public Iraq(UnitedNations mediator) {
        super(mediator);
    }

    public void declare(String message){
        mediator.declare(message,this);
    }

    public void getMessage(String message){
        System.out.println("伊拉克获得对方信息："+message);
    }
}
