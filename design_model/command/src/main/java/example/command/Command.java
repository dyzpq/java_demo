package example.command;

import example.receiver.Barbecuer;

/**
 * @author dengyang
 * @createdate 2019/11/15 0015 15:03
 */
public abstract class Command {

    protected Barbecuer receiver;

    public Command(Barbecuer receiver){
        this.receiver = receiver;
    }

    public abstract void excuteCommand();

}
