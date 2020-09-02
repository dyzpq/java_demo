package example.factory;

import example.product.IDepartment;
import example.product.IUser;

/**
 * @author dengyang
 * @createdate 2019/11/7 0007 12:03
 */
public interface IFactory {
    IUser creatrUser();
    IDepartment createDepartment();
}
