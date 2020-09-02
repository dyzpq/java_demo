package example.reflection;

import example.product.IDepartment;
import example.product.IUser;
import example.reflection.util.PropertiesUtil;

import java.util.Properties;

/**
 * @author dengyang
 * @createdate 2019/11/7 0007 12:28
 */
public class DataAccess {

    public static String dbName;
    public static String packageName = "example.product.";

    static {
        Properties  prop = PropertiesUtil.getProp("dbname.properties");
        dbName = prop.getProperty("db");
    }

    public static IUser getUser() throws Exception {
        String className = packageName+dbName+"User";
        return (IUser)Class.forName(className).newInstance();
    }

    public static IDepartment getDepartment() throws Exception {
        String classNamename = packageName+dbName+"Department";
        return (IDepartment)Class.forName(classNamename).newInstance();
    }
}
