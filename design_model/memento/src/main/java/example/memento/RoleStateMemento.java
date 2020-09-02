package example.memento;

import lombok.Data;

/**
 * @author dengyang
 * @createdate 2019/11/7 0007 17:24
 */
@Data
public class RoleStateMemento {
    private int vit;
    private int ait;
    private int def;

    public RoleStateMemento(int vit,int ait,int def){
        this.vit = vit;
        this.ait = ait;
        this.def = def;
    }
}
