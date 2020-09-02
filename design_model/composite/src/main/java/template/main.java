package template;

import template.component.Composite;
import template.component.Left;

/**
 * @author dengyang
 * @createdate 2019/11/8 0008 11:09
 */
public class main {
    public static void main(String[] args) {
        Composite root = new Composite("root");
        root.add(new Left("Left A"));
        root.add(new Left("Left B"));


        Composite comp = new Composite("Composite X");
        comp.add(new Left("Left XA"));
        comp.add(new Left("Left XB"));

        Composite comp2 = new Composite("Composite XY");
        comp2.add(new Left("Left XYA"));
        comp2.add(new Left("Left XYB"));
        comp.add(comp2);
        root.add(comp);


        root.add(new Left("Left C"));
        Left left =  new Left("Left D");
        root.add(left);

        root.remove(left);

        root.display(1);
    }
}
