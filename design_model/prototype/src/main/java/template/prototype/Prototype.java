package template.prototype;

import lombok.Data;

/**
 * @author dengyang
 * @createdate 2019/11/5 0005 17:39
 */
@Data
public class Prototype implements Cloneable{

    private String id;

    public Prototype(String id){
        this.id = id;
    }

    @Override
    public Prototype clone(){
        Prototype prototype = null;
        try {
            prototype = (Prototype)super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return prototype;
    }
}
