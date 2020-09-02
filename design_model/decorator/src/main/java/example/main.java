package example;

import example.component.Person;
import example.decorator.BigTrouserImpl;
import example.decorator.TshirtsImpl;

/**
 * @author dengyang
 * @createdate 2019/11/5 0005 15:03
 */
public class main {
    public static void main(String[] args) {
        Person person = new Person("DY");

        TshirtsImpl tshirts = new TshirtsImpl();
        BigTrouserImpl bigTrouser = new BigTrouserImpl();

        tshirts.setPerson(person);
        bigTrouser.setPerson(tshirts);
        bigTrouser.show();
    }


}
