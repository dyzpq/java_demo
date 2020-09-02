package template.context;

import template.state.State;

/**
 * @author dengyang
 * @createdate 2019/11/7 0007 14:58
 */
public class Context {
    private State state;

    public Context(State state){
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public void setState(State state){
        this.state = state;
        System.out.println("当前状态："+state.getClass().getName());
    }

    public void Request(){
        state.Handle(this);
    }
}
