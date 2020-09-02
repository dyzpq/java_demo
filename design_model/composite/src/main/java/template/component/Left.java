package template.component;

/**
 * @author dengyang
 * @createdate 2019/11/8 0008 10:54
 */
public class Left extends Component {

    public Left(String name){
        super(name);
    }

    @Override
    public void add(Component c) {
        System.out.println("cannot add to a leaf");
    }

    @Override
    public void remove(Component c) {
        System.out.println("cannot remove from a leaf");
    }

    @Override
    public void display(int depth) {
        for (int i=1 ; i<=depth; i++){
            System.out.print("-");
        }
        System.out.println(name);
    }
}
