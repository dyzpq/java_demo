package example.proxy;

import example.model.SchoolGirl;
import example.subject.GiveGift;
import example.subject.Pursuit;

/**
 * @author dengyang
 * @createdate 2019/11/5 0005 16:12
 */
public class Proxy implements GiveGift {
    Pursuit pursuit;
    public Proxy(SchoolGirl schoolGirl){
        pursuit = new Pursuit(schoolGirl);
    }

    @Override
    public void giveDolls() {
        pursuit.giveDolls();
    }

    @Override
    public void giveFlowers() {
        pursuit.giveFlowers();
    }

    @Override
    public void giveChocolate() {
        pursuit.giveChocolate();
    }
}
