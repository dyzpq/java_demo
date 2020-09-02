package example.abstraction;

import example.implementor.HandsetSoft;
import lombok.Setter;

/**
 * @author dengyang
 * @createdate 2019/11/15 0015 14:43
 */
@Setter
public abstract class HandsetBrand {

    protected HandsetSoft handsetSoft;

    public abstract void run();
}
