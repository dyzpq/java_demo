package list.hashmap;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Author: ddyy
 * @Date: 2020/9/3 0003 14:43
 *
 *  模拟并发情况下向一个HashMap中加入数据
 */
public class ConcurrentHashMapDemo {

    public static void main(String[] args) {
        ConcurrentHashMapDemo concurrentHashMapDemo = new ConcurrentHashMapDemo();

        //concurrentHashMapDemo.before();
        concurrentHashMapDemo.after();
    }

    /**
     *
     * 实验：模拟并发情况下向一个ArrayList中加入数据
     * 结果：数据可能存在丢失现象（加入100的数据，实际上不到100），且在打印list的时候会报错ConcurrentModificationException
     * 原因：HashMap是线程不安全类，在添加的时候没有进行加锁
     */
    public void before(){

        Map<Integer,String> map = new HashMap();

        for (int i = 0; i < 10; i++) {

            int finalI = i;
            new Thread(()->{

                map.put(finalI, UUID.randomUUID().toString().substring(-4));
                System.out.println(map);

            },String.valueOf(i)).start();
        }

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("集合中元素的个数："+map.size());
    }


    /**
     *  解决方案：
     *      方法一：Collections.synchronizedMap(new HashMap<>())
     *      *方法三：new ConcurrentHashMap<>() --->底层使用
     *                                              1.当数组位置还不存在数据时通过CAS进行处理
     *                                              2.当数组位置已存在数据时通过synchronized进行加锁
     */
    public void after(){

        //Map<Integer,String> map = Collections.synchronizedMap(new HashMap<>());
        Map<Integer,String> map = new ConcurrentHashMap<>();


        for (int i = 0; i < 10; i++) {

            int finalI = i;
            new Thread(()->{

                map.put(finalI, UUID.randomUUID().toString().substring(5));
                System.out.println(map);

            },String.valueOf(i)).start();
        }

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("集合中元素的个数："+map.size());
    }
}
