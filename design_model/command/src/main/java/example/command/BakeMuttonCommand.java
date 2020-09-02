package example.command;

import example.receiver.Barbecuer;

/**
 * @author dengyang
 * @createdate 2019/11/15 0015 15:07
 */
public class BakeMuttonCommand extends Command {

    public BakeMuttonCommand(Barbecuer receiver){
        super(receiver);
    }

    @Override
    public void excuteCommand() {
        receiver.bakeMutton();
    }
}
