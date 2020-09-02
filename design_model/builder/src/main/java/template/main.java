package template;

import template.builder.Builder;
import template.builder.ConcerteBuilder2;
import template.builder.ConcreteBuilder1;
import template.director.Director;
import template.product.Product;

/**
 * @author dengyang
 * @createdate 2019/11/6 0006 11:48
 */
public class main {
    public static void main(String[] args) {
        Director director = new Director();
        Builder b1 = new ConcreteBuilder1();
        Builder b2 = new ConcerteBuilder2();

        director.Construct(b1);
        Product p1 = b1.getResult();
        p1.show();

        director.Construct(b2);
        Product p2 = b2.getResult();
        p2.show();
    }
}
