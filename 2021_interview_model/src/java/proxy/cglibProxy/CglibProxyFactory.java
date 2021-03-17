package proxy.cglibProxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;
import proxy.MyTranstation;

import java.lang.reflect.Method;

/**
 * @Author coolDY
 * @Date 2021-03-17
 *  Cglib目标类不需要实现接口也能实现
 */
public class CglibProxyFactory implements MethodInterceptor {

    //维护一个目标对象
    private Object target;

    //事务类
    private MyTranstation myTranstation;

    public CglibProxyFactory(){}

    public CglibProxyFactory(Object target,MyTranstation myTranstation){
        this.myTranstation = myTranstation;
        this.target = target;
    }

    //给目标对象创建一个代理对象
    public Object getProxyInstance(){
        //1.工具类
        Enhancer en = new Enhancer();
        //2.设置父类
        en.setSuperclass(target.getClass());
        //3.设置回调函数
        en.setCallback(this);
        //4.创建子类(代理对象)
        return en.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        myTranstation.before();

        Object returnValue  = method.invoke(target, args);

        myTranstation.after();

        return returnValue;
    }
}
