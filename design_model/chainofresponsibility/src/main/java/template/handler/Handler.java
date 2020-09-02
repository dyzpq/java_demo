package template.handler;

import lombok.Setter;

/**
 * @author dengyang
 * @createdate 2019/11/15 0015 15:43
 */
@Setter
public abstract class Handler {

    protected Handler succerssor;

    public abstract void handleRequest(int request);
}
