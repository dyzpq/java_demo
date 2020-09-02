package example.builder;

/**
 * @author dengyang
 * @createdate 2019/11/6 0006 15:33
 */
public class PersonFatBuilder extends PersonBuilder {
    @Override
    public void buildHead() {
        System.out.print("fat的头 ");
    }

    @Override
    public void buildBody() {
        System.out.print("fat的身体 ");
    }

    @Override
    public void buildArmLeft() {
        System.out.print("fat的左臂 ");
    }

    @Override
    public void buildArmRight() {
        System.out.print("fat的右臂 ");
    }

    @Override
    public void buildLegLeft() {
        System.out.print("fat的左腿 ");
    }

    @Override
    public void buildLegRight() {
        System.out.print("fat的右腿 ");
    }
}
