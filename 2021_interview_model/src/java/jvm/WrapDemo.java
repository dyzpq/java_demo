package jvm;

/**
 * @Author coolDY
 * @Date 2021-02-24
 *
 * 包装类demo
 */
public class WrapDemo {

    public static void main(String[] args) {

        /*//Integer.valueOf()这种方式会先从对象池中取，-128~127会存储在缓存区中，所以两个值是相同的
        Integer integer1 = Integer.valueOf(127);
        Integer integer2 = Integer.valueOf(127);
        System.out.println(integer1 == integer2);//true*/

        /*//编译为字节码后发现实际调用的就是Integer.valueOf(127),同上
        Integer integer1 = 127;
        Integer integer2 = 127;
        System.out.println(integer1 == integer2);//true*/

        /*//128不在对象池中，会创建新对象，所以值不相同
        Integer integer1 = 128;
        Integer integer2 = 128;
        System.out.println(integer1 == integer2);//false*/

        /*//创建的是不同的对象，所以值不同
        Integer integer1 = new Integer(127);
        Integer integer2 = new Integer(127);
        System.out.println(integer1 == integer2);//false*/

        /*//也是调用Boolean.valueOf(),也是在对象池中
        Boolean b1 = true;
        Boolean b2 = true;
        System.out.println(b1 == b2);*/

       /* //浮点类型没有对象池，所以不相等
        Double d1 = 1.0;
        Double d2 = 1.0;
        System.out.println(d1 == d2);*/

    }


}
