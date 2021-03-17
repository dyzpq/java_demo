package proxy;

import proxy.cglibProxy.CglibProxyFactory;
import proxy.cglibProxy.UserService;
import proxy.dynamicProxy.DynamicProxyFactory;
import proxy.staticProxy.IUserDao;
import proxy.staticProxy.UserDao;
import proxy.staticProxy.UserDaoProxy;


/**
 * @Author coolDY
 * @Date 2021-03-17
 */
public class Main {
    public static void main(String[] args) {

        MyTranstation myTranstation = new MyTranstation();

        //测试静态代理
//        IUserDao target = new UserDao();
//        IUserDao proxy = new UserDaoProxy(target,myTranstation);
//        proxy.save();

        //测试动态代理
        // 目标对象
//        IUserDao target = new UserDao();
//        // 给目标对象，创建代理对象
//        IUserDao proxy = (IUserDao)new DynamicProxyFactory(target,myTranstation).getProxyInstrance();
//        // 执行方法   【代理对象】
//        proxy.save();

        //测试cglib代理
        UserService userService = new UserService();
        UserService proxy = (UserService)new CglibProxyFactory(userService,myTranstation).getProxyInstance();
        proxy.save();

    }
}
