package example.subject;

import example.model.SchoolGirl;

/**
 * @author dengyang
 * @createdate 2019/11/5 0005 16:08
 */
public class Pursuit implements GiveGift {
    private SchoolGirl schoolGirl;

    public Pursuit(SchoolGirl schoolGirl){
        this.schoolGirl = schoolGirl;
    }

    @Override
    public void giveDolls() {
        System.out.println(schoolGirl.getName()+"送你洋娃娃");
    }

    @Override
    public void giveFlowers() {
        System.out.println(schoolGirl.getName()+"送你花");
    }

    @Override
    public void giveChocolate() {
        System.out.println(schoolGirl.getName()+"送你巧克力");
    }
}
