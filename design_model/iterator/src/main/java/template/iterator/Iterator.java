package template.iterator;

/**
 * @author dengyang
 * @createdate 2019/11/8 0008 11:56
 */
public abstract class Iterator {

    public abstract Object first();
    public abstract Object next();
    public abstract boolean isDone();
    public abstract Object currentItem();
}
