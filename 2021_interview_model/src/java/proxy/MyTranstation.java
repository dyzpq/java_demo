package proxy;

/**
 * @Author coolDY
 * @Date 2021-03-17
 */
public class MyTranstation {

    public void before(){
        System.out.println("开启事务");
    }

    public void after(){
        System.out.println("结束事务");
    }
}
