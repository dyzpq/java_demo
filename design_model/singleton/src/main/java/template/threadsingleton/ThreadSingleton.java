package template.threadsingleton;

/**
 * @author dengyang
 * @createdate 2019/11/8 0008 17:55
 */
public class ThreadSingleton {

    private static ThreadSingleton instance;

    private static final Object object = new Object();

    private ThreadSingleton(){}

    public static ThreadSingleton getInstance(){
        if(null == instance){
            synchronized (object){
                if (null == instance){
                    instance = new ThreadSingleton();
                }
            }
        }
        return instance;
    }

}
