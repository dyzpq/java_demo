package template.command;

import template.receiver.Receiver;

/**
 * @author dengyang
 * @createdate 2019/11/15 0015 14:55
 */
public abstract class Command {

    protected Receiver receiver;

    public Command(Receiver receiver){
        this.receiver = receiver;
    }

    public abstract void execute();
}
