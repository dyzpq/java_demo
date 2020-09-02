package template.singleton;

/**
 * @author dengyang
 * @createdate 2019/11/8 0008 17:50
 */
public class Singleton {

    private static Singleton instance;

    private Singleton(){}

    public static Singleton getInstance(){
        if(null == instance){
            instance = new Singleton();
        }
        return instance;
    }
}
