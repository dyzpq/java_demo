package example.visitor;

import example.element.Man;
import example.element.Woman;

/**
 * @author dengyang
 * @createdate 2019/11/20 0020 10:35
 */
public class Amativeness extends Action {
    @Override
    public void getManConclusion(Man elementA) {
        System.out.println(elementA.getClass().getSimpleName()+this.getClass().getSimpleName()+"时，凡事不懂也要装懂");
    }

    @Override
    public void getWomenConclusion(Woman elementB) {
        System.out.println(elementB.getClass().getSimpleName()+this.getClass().getSimpleName()+"时，遇事懂也装作不懂");
    }
}
