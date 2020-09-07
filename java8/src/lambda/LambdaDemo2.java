package lambda;

import org.junit.Test;

import java.util.Comparator;
import java.util.function.Consumer;

/**
 * @Author: ddyy
 * @Date: 2020/9/7 0007 16:22
 *
 * 方法引用
 *
 * 情形一：
 *      对象::实例方法
 *
 * 情形二：
 *      类名::静态方法
 *
 * 情形三
 *      类名::实例方法
 *
 *
 * 条件：
 *      1.当lambda方法体中的表达式语句的实现方法和函数式接口的方法参数和返回值都是对应时，可以使用方法引用
 *          解释：
 *              System.out.println(x)  --->public void println(Object x) {
 *              Consumer<T>            --->       void accept(T t);
 *          参数和返回值对应相同，则可以使用方法引用
 *
 *      2.在满足1的情况下，表达式是静态方法时，可以使用“类名::静态方法”
 *      3.在满足1的情况下，出现"参数.方法"的情况时，可以使用“类名::实例方法”
 */
public class LambdaDemo2 {


    /**
     * 对象::实例方法
     */
    @Test
    public void test1(){

        //不使用方法引用
        Consumer con1 = x -> System.out.println(x);
        con1.accept("不使用方法引用");


        //使用方法引用
        Consumer con2 = System.out::println;
        con2.accept("测试一波方法引用");
    }

    /**
     * 类名::静态方法
     */
    @Test
    public void test2(){

        Comparator<Double> comp2 = Double::compare;
        System.out.println(comp2.compare(1D,2D));
    }


    /**
     * 类名::实例方法
     */
    @Test
    public void test3(){
        ////不使用方法引用
        Comparator<Integer> comp1 = (x,y)->  x.compareTo(y);
        System.out.println(comp1.compare(1,2));

        //使用方法引用
        Comparator<Integer> comp2 = Integer::compareTo;
        System.out.println(comp2.compare(1,2));
    }
}
