package example.builder;

/**
 * @author dengyang
 * @createdate 2019/11/6 0006 15:31
 */
public class PersonThinBuilder extends PersonBuilder {
    @Override
    public void buildHead() {
        System.out.print("thin的头 ");
    }

    @Override
    public void buildBody() {
        System.out.print("thin的身体 ");
    }

    @Override
    public void buildArmLeft() {
        System.out.print("thin的左臂 ");
    }

    @Override
    public void buildArmRight() {
        System.out.print("thin的右臂 ");
    }

    @Override
    public void buildLegLeft() {
        System.out.print("thin的左腿 ");
    }

    @Override
    public void buildLegRight() {
        System.out.print("thin的右腿 ");
    }
}
