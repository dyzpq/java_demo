package template.command;

import template.receiver.Receiver;

/**
 * @author dengyang
 * @createdate 2019/11/15 0015 14:58
 */
public class ConcereteCommand extends Command {

    public ConcereteCommand(Receiver receiver){
        super(receiver);
    }

    @Override
    public void execute() {
        receiver.action();
    }
}
