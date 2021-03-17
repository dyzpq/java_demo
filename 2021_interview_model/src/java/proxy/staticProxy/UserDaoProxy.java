package proxy.staticProxy;

/**
 * @Author coolDY
 * @Date 2021-03-17
 */
public class UserDaoProxy implements IUserDao {

    private IUserDao target;

    public UserDaoProxy(){
        super();
    }

    public UserDaoProxy(IUserDao userDao){
        this.target = userDao;
    }

    @Override
    public void save() {
        System.out.println("事务开启");
        target.save();
        System.out.println("事务结束");
    }
}
