package example.targer;

/**
 * @author dengyang
 * @createdate 2019/11/7 0007 16:07
 */
public class Forwards extends Player {

    public Forwards(String name){
        super(name);
    }

    @Override
    public void attack() {
        System.out.println("前锋"+name+"进攻");
    }

    @Override
    public void defense() {
        System.out.println("前锋"+name+"防守");
    }
}
