package template.invoker;

import lombok.Setter;
import template.command.Command;

/**
 * @author dengyang
 * @createdate 2019/11/15 0015 14:55
 */
@Setter
public class Invoker {

    private Command command;

    public void executeCommand(){
        command.execute();
    }
}
