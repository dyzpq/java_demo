package example.reflection.util;


import java.util.Properties;

/**
 * @author dengyang
 * @createdate 2019/11/7 0007 14:22
 * Properties工具类
 */
public class PropertiesUtil {

    public static Properties getProp(String filePath){
        Properties prop = new Properties();
        try {
            prop.load(Thread.currentThread().getContextClassLoader().getResourceAsStream(filePath));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return prop;
    }
}
