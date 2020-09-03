package list.hastset;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/**
 * @Author: ddyy
 * @Date: 2020/9/3 0003 15:36
 *
 * 模拟并发情况下向一个HashSet中加入数据
 */
public class CopyOnWriteArraySetDemo {

    public static void main(String[] args) {
        CopyOnWriteArraySetDemo copyOnWriteArraySetDemo = new CopyOnWriteArraySetDemo();
        //copyOnWriteArraySetDemo.before();
        copyOnWriteArraySetDemo.after();
    }

    /**
     *
     * 实验：模拟并发情况下向一个HashSet中加入数据
     * 结果：数据可能存在丢失现象（加入1000的数据，实际上不到1000），且在打印list的时候会报错ConcurrentModificationException
     * 原因：HashSet是线程不安全类，在添加的时候没有进行加锁
     */
    public void before(){
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < 1000; i++) {

            int finalI = i;

            new Thread(()->{

                set.add(finalI);
                System.out.println(set);

            },String.valueOf(i)).start();
        }

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("集合中元素的个数："+set.size());
    }

    /**
     *  解决方案：
     *      方法一：Collections.synchronizedSet(new HashSet<>())
     *      *方法三：CopyOnWriteArraySet<>() --->底层是CopyOnWriteArrayList--->底层使用synchronized进行加锁
     */
    public void after(){
        //Set<Integer> set = Collections.synchronizedSet(new HashSet<>());
        Set<Integer> set = new CopyOnWriteArraySet<>();

        for (int i = 0; i < 1000; i++) {

            int finalI = i;

            new Thread(()->{

                set.add(finalI);
                System.out.println(set);

            },String.valueOf(i)).start();
        }

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("集合中元素的个数："+set.size());
    }
}
