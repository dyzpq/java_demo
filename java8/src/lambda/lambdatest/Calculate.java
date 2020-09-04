package lambda.lambdatest;

/**
 * @Author: ddyy
 * @Date: 2020/9/4 0004 10:52
 */
@FunctionalInterface
public interface Calculate<T,R> {

    R calculate(T t1,T t2);
}
