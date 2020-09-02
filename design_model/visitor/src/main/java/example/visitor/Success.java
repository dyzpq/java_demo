package example.visitor;

import example.element.Man;
import example.element.Woman;

/**
 * @author dengyang
 * @createdate 2019/11/20 0020 10:32
 */
public class Success extends Action {
    @Override
    public void getManConclusion(Man elementA) {
        System.out.println(elementA.getClass().getSimpleName()+this.getClass().getSimpleName()+"时，背后多半有一个伟大的女人");
    }

    @Override
    public void getWomenConclusion(Woman elementB) {
        System.out.println(elementB.getClass().getSimpleName()+this.getClass().getSimpleName()+"时，背后大多有一个不成功的男人");
    }
}
