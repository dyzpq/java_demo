package template.component;

/**
 * @author dengyang
 * @createdate 2019/11/8 0008 10:52
 */
public abstract class Component {
    protected String name;

    public Component(String name){
        this.name = name;
    }

    public abstract void add(Component c);
    public abstract void remove(Component c);
    public abstract void display(int depth);
}
