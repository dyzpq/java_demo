package template.facade;

import template.subsystem.SubSystemFour;
import template.subsystem.SubSystemOne;
import template.subsystem.SubSystemThree;
import template.subsystem.SubSystemTwo;

/**
 * @author dengyang
 * @createdate 2019/11/6 0006 11:07
 */
public class Facade {
    SubSystemOne one;
    SubSystemTwo two;
    SubSystemThree three;
    SubSystemFour four;

    public Facade(){
        one = new SubSystemOne();
        two = new SubSystemTwo();
        three = new SubSystemThree();
        four = new SubSystemFour();
    }

    public void methodA(){
        System.out.print("组合方式一：");
        one.methodOne();
        two.methodTwo();
        four.methodFour();
    }

    public void methodB(){
        System.out.print("组合方式二：");
        one.methodOne();
        three.methodThree();
        four.methodFour();
    }
}
