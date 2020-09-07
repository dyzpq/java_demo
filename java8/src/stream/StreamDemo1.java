package stream;

import lambda.lambdatest.Employee;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * @Author: ddyy
 * @Date: 2020/9/7 0007 17:13
 *
 * Stream的中间操作
 *
 * 1.筛选与切片
 *      filter: 通过自定义条件过滤
 *      limit:  取前n个数据
 *      skip:   跳过前n个数据
 *      distinct:通过hashCode和equals进行去重
 *
 * 2.映射
 *      map:    对流中每一个元素进行函数式接口定义方法的处理
 *      flatMap:    将每一个元素转换为一个流，最后组装为一个新的流（扁平化）
 *
 * 3.排序
 *      sorted  排序操作
 */
public class StreamDemo1 {

    List<Employee> employees = Arrays.asList(
            new Employee("zs",18,4444.44),
            new Employee("ls",19,3333.33),
            new Employee("ww",40,5555.55),
            new Employee("zl",30,6666.66),
            new Employee("zl",30,6666.66)
    );

    /**
     * 1.筛选与切片
     */
    @Test
    public void test1(){
        //filter: 通过自定义条件过滤
        employees.stream()
                .filter(x->x.getAge()>18)
                .forEach(System.out::println);

        System.out.println("-----------------------------------------");

        //limit:  取前n个数据
        employees.stream()
                .limit(3)
                .forEach(System.out::println);

        System.out.println("-----------------------------------------");

        //skip:   跳过前n个数据
        employees.stream()
                .skip(2)
                .forEach(System.out::println);

        System.out.println("-----------------------------------------");

        //distinct:通过hashCode和equals进行去重
        employees.stream()
                .distinct()
                .forEach(System.out::println);
    }

    @Test
    public void test2(){
        String[] strs = {"aa","bbb","c","dd"};

        // map:    对流中每一个元素进行函数式接口定义方法的处理
        Arrays.stream(strs)
                .map(String::toUpperCase)
                .forEach(System.out::println);


        //flatMap:    将每一个元素转换为一个流，最后所有流整合一个流（扁平化）
        Arrays.stream(strs)
                .flatMap(t -> Arrays.stream(strs)
                        .filter(s -> s.length() == t.length()))
                .forEach(System.out::println);

    }

    @Test
    public void test3(){
        //sorted  排序操作
        employees.stream()
                .sorted((x,y)-> -x.getAge().compareTo(y.getAge()))
                .forEach(System.out::println);
    }
}
