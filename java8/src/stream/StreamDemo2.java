package stream;

import lambda.lambdatest.Employee;
import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @Author: ddyy
 * @Date: 2020/9/7 0007 17:49
 *
 * Stream终止操作
 *
 * 1.查找与匹配
 *      allMatch：   是否匹配所有元素
 *      anyMatch:    是否至少匹配一个元素
 *      noneMatch:   是否没有匹配所有元素
 *      findFirst:   返回第一个元素
 *      findAny:     任意返回一个元素
 *      count:       获取总个数
 *      max:         获取最大值
 *      min:         获取最小值
 *
 * 2.规约
 *      reduce       将流中的元素反复结合起来，聚合为一个值
 *
 * 3.收集
 *      collect      接受一个Collector接口实现，用于给Stream中元素做汇总方法
 */
public class StreamDemo2 {

    List<Employee> employees = Arrays.asList(
            new Employee("zs",18,4444.44,Employee.Status.FREE),
            new Employee("ls",19,3333.33,Employee.Status.VOCATION),
            new Employee("ww",40,5555.55,Employee.Status.BUSY),
            new Employee("zl",30,6666.66,Employee.Status.FREE),
            new Employee("zl",30,6666.66,Employee.Status.BUSY)
    );

    @Test
    public void test1(){
        //allMatch：   是否匹配所有元素
        boolean b = employees.stream()
                .allMatch(s -> s.getStatus().equals(Employee.Status.FREE));
        System.out.println(b);

        //anyMatch:    是否至少匹配一个元素
        boolean b1 = employees.stream()
                .anyMatch(s -> s.getStatus().equals(Employee.Status.FREE));
        System.out.println(b1);

        //noneMatch:   是否没有匹配所有元素
        boolean b2 = employees.stream()
                .noneMatch(s -> s.getStatus().equals(Employee.Status.FREE));
        System.out.println(b2);

        //findFirst:   返回第一个元素
        Optional<Employee> first = employees.stream()
                .findFirst();
        System.out.println(first.get());

        //findAny:     任意返回一个元素
        Optional<Employee> any = employees.stream()
                .findAny();
        System.out.println(any.get());

        //count:       获取总个数
        long count = employees.stream()
                .count();
        System.out.println(count);

        //max:         获取最大值
        Optional<Employee> max = employees.stream()
                .max((x, y) -> x.getAge().compareTo(y.getAge()));
        System.out.println(max.get());

        //min:         获取最小值
        Optional<Integer> min = employees.stream()
                .map(Employee::getAge)
                .min(Integer::compareTo);
        System.out.println(min.get());
    }


    @Test
    public void test2(){
        //reduce       将流中的元素反复结合起来，聚合为一个值

        //带初始值
        Integer reduce = employees.stream()
                .map(Employee::getAge)
                .reduce(0, (x, y) -> x + y);
        System.out.println(reduce);

        //不带初始值
        Optional<Integer> reduce1 = employees.stream()
                .map(Employee::getAge)
                .reduce((x, y) -> x + y);
        System.out.println(reduce1.get());
    }

    @Test
    public void test3(){
        //collect      接受一个Collector接口实现，用于给Stream中元素做汇总方法

        //分组处理
        Map<String, List<Employee>> collect = employees.stream()
                .collect(Collectors.groupingBy(Employee::getStatus));
        System.out.println(collect);

        //分区处理
        Map<Boolean, List<Employee>> collect1 = employees.stream()
                .collect(Collectors.partitioningBy(s -> s.getStatus().equals(Employee.Status.FREE)));
        System.out.println(collect1);

    }
}
