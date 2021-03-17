package proxy.dynamicProxy;

import proxy.MyTranstation;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author coolDY
 * @Date 2021-03-17
 */
public class DynamicProxyFactory{

    //维护一个目标对象
    private Object target;

    //事务类
    private MyTranstation myTranstation;

    public DynamicProxyFactory(){}

    public DynamicProxyFactory(Object target,MyTranstation myTranstation){
        this.target = target;
        this.myTranstation = myTranstation;
    }

    //给目标对象生成代理对象(方式一)
    public Object getProxyInstrance(){
        return Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                (proxy,method,args)->{
                    myTranstation.before();
                    //执行目标对象方法
                    Object returnValue = method.invoke(target, args);
                    myTranstation.after();
                    return returnValue;
                });
    }



    //给目标对象生成代理对象（方式二）
//    public Object getProxyInstrance(){
//        return Proxy.newProxyInstance(
//                target.getClass().getClassLoader(),
//                target.getClass().getInterfaces(),
//                new InvocationHandler() {
//                    @Override
//                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//                        System.out.println("开启事务");
//                        Object returnValue = method.invoke(target, args);
//                        System.out.println("关闭事务");
//                        return returnValue;
//                    }
//                });
//    }




    //给目标对象生成代理对象（方式三）
    //需要实现 implements InvocationHandler
//    public Object getProxyInstrance(){
//        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(),this::invoke);
//    }
//
//    @Override
//    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//        System.out.println("开启事务");
//        //执行目标对象方法
//        Object returnValue = method.invoke(target, args);
//        System.out.println("关闭事务");
//        return returnValue;
//    }
}
