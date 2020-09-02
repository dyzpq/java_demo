package example.product;

/**
 * @author dengyang
 * @createdate 2019/11/7 0007 12:05
 */
public class SqlServerUser implements IUser {
    @Override
    public void insert(IUser user) {
        System.out.println("SqlServerUser插入");
    }

    @Override
    public IUser getUser(int id) {
        return null;
    }
}
