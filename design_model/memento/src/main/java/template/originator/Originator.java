package template.originator;

import lombok.Data;
import template.memento.Memento;

/**
 * @author dengyang
 * @createdate 2019/11/7 0007 17:06
 * 发起人类
 */
@Data
public class Originator {

    private String state;

    public Memento createMemento(){
        return new Memento(state);
    }

    public void setMemento(Memento memento){
        state = memento.getState();
    }

    public void show(){
        System.out.println("state="+state);
    }
}
