package example.factory;

import example.product.AccessDepartment;
import example.product.AccessUser;
import example.product.IDepartment;
import example.product.IUser;

/**
 * @author dengyang
 * @createdate 2019/11/7 0007 12:10
 */
public class AccessFactory implements IFactory {
    @Override
    public IUser creatrUser() {
        return new AccessUser();
    }

    @Override
    public IDepartment createDepartment() {
        return new AccessDepartment();
    }
}
