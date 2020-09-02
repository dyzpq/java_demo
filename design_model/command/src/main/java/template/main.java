package template;

import template.command.Command;
import template.command.ConcereteCommand;
import template.invoker.Invoker;
import template.receiver.Receiver;

/**
 * @author dengyang
 * @createdate 2019/11/15 0015 15:00
 */
public class main {
    public static void main(String[] args) {
        Receiver r = new Receiver();
        Command c = new ConcereteCommand(r);
        Invoker i = new Invoker();

        i.setCommand(c);
        i.executeCommand();
    }
}
