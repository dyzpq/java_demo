package template.flyweigth;

/**
 * @author dengyang
 * @createdate 2019/11/15 0015 17:13
 */
public class ConcreteFlyweigth extends Flyweigth {
    @Override
    public void operation(int extrinsicstate) {
        System.out.println("具体Flyweigth："+extrinsicstate);
    }
}
