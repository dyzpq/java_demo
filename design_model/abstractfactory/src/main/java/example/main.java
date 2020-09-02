package example;

import example.factory.AccessFactory;
import example.factory.IFactory;
import example.factory.SqlServerFactory;
import example.product.IDepartment;
import example.product.IUser;
import example.reflection.DataAccess;

/**
 * @author dengyang
 * @createdate 2019/11/7 0007 12:11
 */
public class main {
    public static void main(String[] args) {
        IFactory factory;
        factory = new SqlServerFactory();

        IUser sqlServerUser = factory.creatrUser();
        IDepartment sqlServerDepartment = factory.createDepartment();
        sqlServerUser.insert(sqlServerUser);
        sqlServerDepartment.insert(sqlServerDepartment);

        factory = new AccessFactory();
        IUser accessUser = factory.creatrUser();
        IDepartment accessDepartment = factory.createDepartment();
        accessUser.insert(accessUser);
        accessDepartment.insert(accessDepartment);
        System.out.println("------------------------------------");

        try {
            IUser user = DataAccess.getUser();
            IDepartment department = DataAccess.getDepartment();
            user.insert(user);
            department.insert(department);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
