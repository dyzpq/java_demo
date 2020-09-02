package example.command;

import example.receiver.Barbecuer;

/**
 * @author dengyang
 * @createdate 2019/11/15 0015 15:10
 */
public class BakeChickenWingCommand extends Command {

    public BakeChickenWingCommand(Barbecuer recevier){
        super(recevier);
    }

    @Override
    public void excuteCommand() {
        receiver.bakeChickenWing();
    }
}
