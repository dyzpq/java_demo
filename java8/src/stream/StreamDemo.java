package stream;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * @Author: ddyy
 * @Date: 2020/9/7 0007 16:58
 *
 * Stream的创建
 *
 * 方法一：通过集合获取流
 *      集合.stream();
 *
 * 方法二：通过数组获取流
 *      Arrays.stream()
 *
 * 方法三：通过值获取流
 *      Stream.of()
 *
 *  方式四：获取无线流
 *      Stream.iterate(0, (x) -> x + 2)
 *
 */
public class StreamDemo {

    @Test
    public void test1(){

        //通过集合获取流
        List<String> list = new ArrayList<>();
        Stream<String> stream1 = list.stream();

        //通过数组获取流
        String[] strs = new String[10];
        Stream<String> stream2 = Arrays.stream(strs);

        //通过值获取流
        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4);

        //获取无线流
        Stream<Integer> iterate = Stream.iterate(0, (x) -> x + 2);

    }
}
