package template.component;

import java.util.ArrayList;
import java.util.List;

/**
 * @author dengyang
 * @createdate 2019/11/8 0008 10:58
 */
public class Composite extends Component {

    private List<Component> children = new ArrayList<>();

    public Composite(String name){
        super(name);
    }

    @Override
    public void add(Component c) {
        children.add(c);
    }

    @Override
    public void remove(Component c) {
        children.remove(c);
    }

    @Override
    public void display(int depth) {
        for (int i=1 ; i<=depth; i++){
            System.out.print("-");
        }
        System.out.println(name);

        for (Component child : children) {
            child.display(depth+2);
        }
    }
}
