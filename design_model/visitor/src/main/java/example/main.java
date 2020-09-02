package example;

import example.element.Man;
import example.element.Woman;
import example.objectstruture.ObjectStructure;
import example.visitor.Amativeness;
import example.visitor.Failing;
import example.visitor.Success;


/**
 * @author dengyang
 * @createdate 2019/11/20 0020 10:39
 */
public class main {
    public static void main(String[] args) {
        ObjectStructure o = new ObjectStructure();
        o.attach(new Man());
        o.attach(new Woman());

        Success v1 = new Success();
        o.display(v1);

        Failing v2 = new Failing();
        o.display(v2);

        Amativeness v3 = new Amativeness();
        o.display(v3);

    }


}
