package lambda.lambdatest;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @Author: ddyy
 * @Date: 2020/9/4 0004 10:12
 */
public class LambdaTest {

//    Employee[] e = {
//            new Employee("zs",18,253.33),
//            new Employee("zs",18,253.33),
//            new Employee("zs",18,253.33),
//            new Employee("zs",18,253.33)
//    };

    List<Employee> employees = Arrays.asList(
            new Employee("zs",18,4444.44),
            new Employee("ls",18,3333.33),
            new Employee("ww",40,5555.55),
            new Employee("zl",30,6666.66)
    );

    /**
     * 练习一：通过Collections.sort()对employees进行排序，
     *        先通过年龄排序，年龄相同在根据薪资排序
     */
    @Test
    public void test1(){

        Collections.sort(employees,(o1,o2) ->{
            if(o1.getAge().compareTo(o2.getAge())==0){
                return o1.getSalary().compareTo(o2.getSalary());
            }else {
                return o1.getAge().compareTo(o2.getAge());
            }
        });

        for (Employee employee : employees) {
            System.out.println(employee);
        }

        //employees.stream().forEach(System.out::println);
    }


    /**
     * 练习二：新建一个函数式接口，
     * 将字符串转换为大写且截取2到4的字符串
     */
    @Test
    public void test2(){

        //第一种：自己的版本
        /*StringConvert stringConvert = (str -> str.toUpperCase().substring(2,5));

        String zasesffet = stringConvert.getValue("zasesffet");
        System.out.println(zasesffet);*/

        //第二种：通过策略模式进行处理
        String zasesffet = this.getValue("zasesffet", str -> str.toUpperCase().substring(2, 5));
        System.out.println(zasesffet);


        //第三种：方法引用方式
        StringConvert sc = String::toUpperCase;
        String zasesffet1 = sc.getValue("zasesffet");
        System.out.println(zasesffet1);
    }

    //策略模式
    public String getValue(String str,StringConvert sc){
        return sc.getValue(str);
    }


    /**
     * 练习三：新建一个函数式接口，
     * 计算两个数的差，
     * 计算两个数的乘积
     */
    @Test
    public void test3(){

        //自己的版本
        /*Calculate<Long,Long> calculate = (x,y) -> x-y;
        System.out.println(calculate.calculate(20L, 30L));

        System.out.println("--------------------------------");

        Calculate<Long,Long> calculate1 = (x,y) -> x*y;
        System.out.println(calculate1.calculate(20L, 30L));*/

        this.oper(20L,30L,(x,y)->x - y);

        this.oper(20L,30L,(x,y)->x * y);

    }

    //策略模式
    public void oper(Long l1,Long l2,Calculate<Long,Long> calculate){
        System.out.println(calculate.calculate(l1,l2));
    }
}
