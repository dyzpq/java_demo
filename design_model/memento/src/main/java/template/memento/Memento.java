package template.memento;

import lombok.Getter;

/**
 * @author dengyang
 * @createdate 2019/11/7 0007 17:06
 * 备忘录类
 */
@Getter
public class Memento {

    private String state;

    public Memento(String state){
        this.state = state;
    }
}
