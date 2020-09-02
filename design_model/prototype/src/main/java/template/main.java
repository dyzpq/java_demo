package template;

import template.prototype.Prototype;

/**
 * @author dengyang
 * @createdate 2019/11/5 0005 17:39
 */
public class main {

    public static void main(String[] args) {
        Prototype p1 = new Prototype("P");
        Prototype c1 = p1.clone();

        System.out.println(p1==(c1));

    }
}
