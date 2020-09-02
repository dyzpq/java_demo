package example.context;

import example.state.State;
import lombok.Data;

/**
 * @author dengyang
 * @createdate 2019/11/7 0007 15:11
 */
@Data
public class Work {
    private State state;
    private double hour;
    private boolean finish = false;

    public boolean getTaskFinish(){
        return finish;
    }

    public void setTaskFinish(boolean finish){
        this.finish = finish;
    }

    public void writeProgram(){
        state.writeProgram(this);
    }
}
