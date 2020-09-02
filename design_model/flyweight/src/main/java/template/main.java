package template;

import template.flyweightfactory.FlyweightFactory;
import template.flyweigth.Flyweigth;
import template.flyweigth.UnsharedConcreteFlyweigth;

/**
 * @author dengyang
 * @createdate 2019/11/15 0015 17:17
 */
public class main {
    public static void main(String[] args) {
        int extrinsicstate = 22;

        FlyweightFactory f = new FlyweightFactory();

        Flyweigth fx = f.getFlyweigth("X");
        fx.operation(--extrinsicstate);

        Flyweigth fy = f.getFlyweigth("Y");
        fy.operation(--extrinsicstate);

        Flyweigth fz = f.getFlyweigth("Z");
        fz.operation(--extrinsicstate);

        Flyweigth uf = new UnsharedConcreteFlyweigth();
        uf.operation(--extrinsicstate);



    }
}
