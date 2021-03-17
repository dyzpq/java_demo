package proxy.staticProxy;

import proxy.MyTranstation;

/**
 * @Author coolDY
 * @Date 2021-03-17
 */
public class UserDaoProxy implements IUserDao {

    private IUserDao target;

    //事务类
    private MyTranstation myTranstation;

    public UserDaoProxy(){
        super();
    }

    public UserDaoProxy(IUserDao userDao,MyTranstation myTranstation){
        this.target = userDao;
        this.myTranstation = myTranstation;
    }

    @Override
    public void save() {
        myTranstation.before();
        target.save();
        myTranstation.after();
    }
}
