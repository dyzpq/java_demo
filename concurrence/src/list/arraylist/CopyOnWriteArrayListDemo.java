package list.arraylist;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @Author: ddyy
 * @Date: 2020/9/3 0003 9:52
 *
 * 模拟并发情况下向一个ArrayList中加入数据
 */
public class CopyOnWriteArrayListDemo {

    public static void main(String[] args) {
        CopyOnWriteArrayListDemo copyOnWriteArrayListDemo = new CopyOnWriteArrayListDemo();
        copyOnWriteArrayListDemo.before();
        //copyOnWriteArrayListDemo.after();
    }

    /**
     *
     * 实验：模拟并发情况下向一个ArrayList中加入数据
     * 结果：数据可能存在丢失现象（加入100的数据，实际上不到100），且在打印list的时候会报错ConcurrentModificationException
     * 原因：ArrayList是线程不安全类，在添加的时候没有进行加锁
     */
    public void before(){

        List<String> list = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            final int tempInt = i;

            new Thread(()->{
                list.add("第"+tempInt+"进入");
                System.out.println(list);
            },String.valueOf(i)).start();
        }

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("最终集合中的数量："+list.size());

    }


    /**
     *  解决方案：
     *      方法一：new Vector<>()
     *      方法二：Collections.synchronizedList(new ArrayList())
     *      *方法三：new CopyOnWriteArrayList<>()--->底层使用ReentrantLock进行加锁
     */
    public void after(){

        //List<String> list = Collections.synchronizedList(new ArrayList());
        //List<String> list = new Vector<>();
        List<String> list = new CopyOnWriteArrayList<>();

        for (int i = 0; i < 100; i++) {
            final int tempInt = i;

            new Thread(()->{
                list.add("第"+tempInt+"个进入");
                System.out.println(list);
            },String.valueOf(i)).start();
        }


        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("最终集合中的数量："+list.size());

    }


}
