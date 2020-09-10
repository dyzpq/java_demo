package stream.streamtest;

import lambda.lambdatest.Employee;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @Author ddyy
 * @Date 2020/9/10 0010 10:40
 */
public class StreamTest {

    /**
     * 1.给定一个数字列表，如何返回一个由每个数的平方构成的列表？
     *  [1,2,3,4,5] --->[1,4,9,16,25]
     */
    @Test
    public void test1(){
        Integer[] nums = {1,2,3,4,5};
        List<Integer> collect = Arrays.stream(nums)
                .map(x -> x * x)
                .collect(Collectors.toList());

        System.out.println(collect);
    }

    List<Employee> employees = Arrays.asList(
            new Employee("zs",18,4444.44),
            new Employee("ls",19,3333.33),
            new Employee("ww",40,5555.55),
            new Employee("zl",30,6666.66),
            new Employee("zl",30,6666.66)
    );

    /**
     * 怎样用map和reduce方法数一数流中有多少个Employee?
     */
    @Test
    public void test2(){
        //方法一：
        Integer reduce = employees.stream()
                .map(x -> 1)
                .reduce(0,(x,y)->x+y);
        System.out.println(reduce);

        //方法二：
        Integer reduce1 = employees.stream()
                .map(x -> 1)
                .reduce(0,Integer::sum);
        System.out.println(reduce1);

    }


    List<Transation> transations = null;

    @Before
    public void before(){
        Trader raoul = new Trader("Raoul","Cambridge");
        Trader mario = new Trader("Mario","Milan");
        Trader alan = new Trader("Alan","Cambridge");
        Trader brian = new Trader("Brian","Cambridge");


        transations = Arrays.asList(
                new Transation(brian,2011,300),
                new Transation(raoul,2012,1000),
                new Transation(raoul,2011,400),
                new Transation(mario,2012,710),
                new Transation(mario,2012,700),
                new Transation(alan,2012,950)
        );
    }

    @Test
    public void test3(){
        //1.找出2011年发生的所有交易，并按交易额排序（从低到高）
        transations.stream()
                .filter(t -> t.getYear()==2011)
                .sorted((x,y)->{
                    if(x.getValue()<y.getValue()){
                        return -1;
                    }else {
                        return 1;
                    }
                })
                .forEach(System.out::println);
        //优化版本
        transations.stream()
                .filter(t -> t.getYear()==2011)
                .sorted((x,y)->Integer.compare(x.getValue(),y.getValue()))
                .forEach(System.out::println);


        System.out.println("-------------------------------------------------");




        //2.交易员都在哪些不同的城市工作过？
        transations.stream()
                .map(t->t.getTrader().getCity())
                .distinct()
                .forEach(System.out::println);

        System.out.println("-------------------------------------------------");




        //3.查找所有来自剑桥的交易员，并按姓名排序
        transations.stream()
                .map(t->t.getTrader())
                .filter(t->t.getCity().equals("Cambridge"))
                .distinct()
                .sorted((x,y)->x.getName().compareTo(y.getName()))
                .forEach(System.out::println);

        System.out.println("-------------------------------------------------");




        //4.返回所有交易员的姓名字符串，按字母顺序排序
        transations.stream()
                .map(t->t.getTrader().getName())
                .distinct()
                .sorted(String::compareTo)
                .forEach(System.out::println);

        //将名字拼接为字符串，字符串按照字母排序
        transations.stream()
                .map(t->t.getTrader().getName())
                .flatMap(StreamTest::characterFilter)
                .sorted()
                .forEach(System.out::print);
        System.out.println();


        System.out.println("-------------------------------------------------");




        //5.有没有交易员是在米兰工作的
        boolean milan = transations.stream()
                .map(t -> t.getTrader().getCity())
                .anyMatch(t -> t.equals("Milan"));
        System.out.println(milan);

        System.out.println("-------------------------------------------------");




        //6.打印生活在剑桥的交易员的所有交易额
        transations.stream()
                .filter(t->t.getTrader().getCity().equals("Cambridge"))
                .map(t->t.getValue())
                .forEach(System.out::println);

        System.out.println("-------------------------------------------------");




        //7.所有交易中，最高的交易额是多少
        Optional<Integer> max = transations.stream()
                .map(t -> t.getValue())
                .max(Integer::compareTo);
        System.out.println(max.get());

        //优化版本
        Optional<Integer> max1 = transations.stream()
                .map(Transation::getValue)
                .max(Integer::compareTo);
        System.out.println(max1.get());

        System.out.println("-------------------------------------------------");




        //8.找到交易额最小的交易
        Optional<Transation> min = transations.stream()
                .min((x, y) -> {
                    if (x.getValue() < y.getValue()) {
                        return -1;
                    } else {
                        return 1;
                    }
                });
        System.out.println(min.get());

        //优化版本
        Optional<Transation> min1 = transations.stream()
                .min((x,y)->Integer.compare(x.getValue(),y.getValue()));
        System.out.println(min1.get());
    }

    public static Stream<Character> characterFilter(String str){
        List<Character> chars = new ArrayList<>();

        for (Character ch : str.toCharArray()) {
            chars.add(ch);
        }

        return chars.stream();
    }

}
