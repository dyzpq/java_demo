package example.targer;

/**
 * @author dengyang
 * @createdate 2019/11/7 0007 16:09
 */
public class Center extends Player {

    public Center(String name){
        super(name);
    }
    @Override
    public void attack() {
        System.out.println("中锋"+name+"进攻");
    }

    @Override
    public void defense() {
        System.out.println("中锋"+name+"防守");
    }
}
