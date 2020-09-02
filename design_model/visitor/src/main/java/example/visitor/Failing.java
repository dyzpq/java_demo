package example.visitor;

import example.element.Man;
import example.element.Woman;

/**
 * @author dengyang
 * @createdate 2019/11/20 0020 10:34
 */
public class Failing extends Action {
    @Override
    public void getManConclusion(Man elementA) {
        System.out.println(elementA.getClass().getSimpleName()+this.getClass().getSimpleName()+"时，闷头喝酒，谁也不用劝");
    }

    @Override
    public void getWomenConclusion(Woman elementB) {
        System.out.println(elementB.getClass().getSimpleName()+this.getClass().getSimpleName()+"时，眼泪汪汪，谁也劝不了");
    }
}
