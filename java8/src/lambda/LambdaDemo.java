package lambda;

        import org.junit.Test;

        import java.util.Comparator;
        import java.util.function.Consumer;

/**
 * @Author: ddyy
 * @Date: 2020/9/3 0003 18:00
 *
 * Lambda表达式：替换创建接口时使用匿名内部类的方式;
 *              需要函数式接口的支持（函数式接口：接口中有且只有一个抽象方法）
 *
 *  () -> {}
 *  左边小括号中是方法的参数
 *  右边大括号中是具体方法中的执行语句
 *
 * lambda表达式基础语法：
 *      语法一：无参数，无返回值
 *              ()-> System.out.println("hello lambda")
 *
 *      语法二：有一个参数，无返回值
 *              (x) -> System.out.println(x)
 *
 *      语法三：只有一个参数，左边括号可以省略
 *              x -> System.out.println(x)
 *
 *      语法四：有两个参数，有返回值
 *              (x,y) -> {
 *                  System.out.println("进来一波");
 *                  return x.compareTo(y);
 *              };
 *
 *      语法五：有返回值时，执行语句只有一条，可以省略大括号和return
 *              (x,y) -> x.compareTo(y)
 *
 */
public class LambdaDemo {

    /**
     * 无参数，无返回值
     */
    @Test
    public void test1(){

        //匿名内部类方式处理
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("hello world");
            }
        };
        r1.run();

        System.out.println("-----------------");

        //lambda表达式处理
        Runnable r2 = ()-> System.out.println("hello lambda");
        r2.run();
    }

    /**
     * 有一个参数，无返回值
     */
    @Test
    public void test2(){
        Consumer<String> consumer = (x) -> System.out.println(x);

        consumer.accept("lambda表达式测试一波");
    }

    /**
     * 只有一个参数，左边括号可以省略
     */
    @Test
    public void test3(){
        Consumer<String> consumer = x -> System.out.println(x);

        consumer.accept("lambda表达式测试一波");
    }

    /**
     * 有两个参数，有返回值
     */
    @Test
    public void test4(){

        Comparator<Integer> comparator = (x,y) -> {
            System.out.println("进来一波");
            return x.compareTo(y);
        };

        System.out.println(comparator.compare(1, 2));
    }


    /**
     * 有返回值时，执行语句只有一条，可以省略大括号和return
     */
    @Test
    public void test5(){

        Comparator<Integer> comparator = (x,y) -> x.compareTo(y);

        System.out.println(comparator.compare(1, 2));
    }
}
