package example.factory;

import example.product.IDepartment;
import example.product.IUser;
import example.product.SqlServerDepartment;
import example.product.SqlServerUser;

/**
 * @author dengyang
 * @createdate 2019/11/7 0007 12:10
 */
public class SqlServerFactory implements IFactory {
    @Override
    public IUser creatrUser() {
        return new SqlServerUser();
    }

    @Override
    public IDepartment createDepartment() {
        return new SqlServerDepartment();
    }
}
