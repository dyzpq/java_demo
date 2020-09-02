package template.flyweigth;

/**
 * @author dengyang
 * @createdate 2019/11/15 0015 17:13
 */
public class UnsharedConcreteFlyweigth extends Flyweigth {
    @Override
    public void operation(int extrinsicstate) {
        System.out.println("不共享的具体Flyweight："+ extrinsicstate);
    }
}
