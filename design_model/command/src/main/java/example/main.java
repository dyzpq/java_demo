package example;

import example.command.BakeChickenWingCommand;
import example.command.BakeMuttonCommand;
import example.command.Command;
import example.invoker.Waiter;
import example.receiver.Barbecuer;

/**
 * @author dengyang
 * @createdate 2019/11/15 0015 15:17
 */
public class main {
    public static void main(String[] args) {
        Barbecuer boy = new Barbecuer();
        Command bakeMuttonCommand1 = new BakeMuttonCommand(boy);
        Command bakeMuttonCommand2 = new BakeMuttonCommand(boy);
        Command bakeChickenWingCommand1 = new BakeChickenWingCommand(boy);
        Waiter girl = new Waiter();

        girl.setOrders(bakeMuttonCommand1);
        girl.setOrders(bakeMuttonCommand2);
        girl.setOrders(bakeChickenWingCommand1);

        girl.notifyPeople();
    }
}
