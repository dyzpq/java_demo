package example;

import example.model.SchoolGirl;
import example.proxy.Proxy;

/**
 * @author dengyang
 * @createdate 2019/11/5 0005 16:14
 */
public class main {
    public static void main(String[] args) {
        SchoolGirl schoolGirl = new SchoolGirl();
        schoolGirl.setName("YYL");

        Proxy proxy = new Proxy(schoolGirl);
        proxy.giveDolls();
        proxy.giveFlowers();
        proxy.giveChocolate();
    }
}
