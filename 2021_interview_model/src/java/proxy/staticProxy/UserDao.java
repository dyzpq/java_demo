package proxy.staticProxy;

/**
 * @Author coolDY
 * @Date 2021-03-17
 */
public class UserDao implements IUserDao {
    @Override
    public void save() {
        System.out.println("UserDao-->save");
    }
}
