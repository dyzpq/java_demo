package lambda;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * @Author: ddyy
 * @Date: 2020/9/7 0007 10:23
 * 四大内置函数式接口
 *
 *  消费型接口(有参无返回值)
 *  Consumer<T>  void accept(T t);
 *
 *  供给型接口(无参有返回值)
 *  Supplier    T get();
 *
 *  函数型接口(有参有返回值)
 *  Function    R apply(T t);
 *
 *  断言型接口(有参返回值为boolean类型)
 *  Predicate   boolean test(T t);
 *
 */
public class LambdaDemo1 {


    /**
     * 消费型接口(有参无返回值)
     * Consumer<T>  void accept(T t);
     */
    @Test
    public void test1(){
        this.func1("测试一波消费型接口",x-> System.out.println(x));
    }

    public void func1(String str, Consumer<String> consumer){
        consumer.accept(str);
    }


    /**
     *  供给型接口(无参有返回值)
     *  Supplier    T get();
     */
    @Test
    public void test2(){
        List<String> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            String str = this.func2(()-> UUID.randomUUID().toString().substring(10));
            list.add(str);
        }


        list.stream().forEach(System.out::println);
    }

    public String func2(Supplier<String> supplier){
        return supplier.get();
    }


    /**
     * 函数型接口(有参有返回值)
     * Function    R apply(T t);
     */
    @Test
    public void test3(){
        String str = "测试一波函数式接口";

        String newStr = this.func3(str, x -> x.substring(0, 4));

        System.out.println(newStr);
    }

    public String func3(String str, Function<String,String> function){
        return function.apply(str);
    }


    /**
     * 断言型接口(有参返回值为boolean类型)
     * Predicate   boolean test(T t);
     */
    @Test
    public void test4(){
        String str = "测试一波断言式接口";

        boolean result = this.func4(str,(x) -> x.length()>5);

        System.out.println(result);
    }

    public boolean func4(String str,Predicate<String> predicate){
        return predicate.test(str);
    }
}
