package template.finalsingleton;

/**
 * @author dengyang
 * @createdate 2019/11/8 0008 18:05
 */
public final class FinalSingleton {

    private static final FinalSingleton instance = new FinalSingleton();

    private FinalSingleton(){}

    public static FinalSingleton getInstance(){
        return instance;
    }
}
