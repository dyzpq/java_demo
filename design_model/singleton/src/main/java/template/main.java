package template;

import template.finalsingleton.FinalSingleton;
import template.singleton.Singleton;
import template.threadsingleton.ThreadSingleton;

/**
 * @author dengyang
 * @createdate 2019/11/8 0008 17:51
 */
public class main {
    public static void main(String[] args) {
        //普通单例
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        System.out.println(s1 == s2);

        //多线程双重锁单例
        ThreadSingleton ts1 = ThreadSingleton.getInstance();
        ThreadSingleton ts2 = ThreadSingleton.getInstance();
        System.out.println(ts1 == ts2);

        //多线程简化单例
        FinalSingleton fs1 = FinalSingleton.getInstance();
        FinalSingleton fs2 = FinalSingleton.getInstance();
        System.out.println(fs1 == fs2);
    }
}
