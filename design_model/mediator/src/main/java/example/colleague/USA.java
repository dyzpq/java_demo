package example.colleague;

import example.mediator.UnitedNations;

/**
 * @author dengyang
 * @createdate 2019/11/15 0015 16:53
 */
public class USA extends Country {

    public USA(UnitedNations mediator) {
        super(mediator);
    }

    public void declare(String message){
        mediator.declare(message,this);
    }

     public void getMessage(String message){
         System.out.println("美国获得对方信息："+message);
     }
}
