package example.invoker;

import example.command.Command;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author dengyang
 * @createdate 2019/11/15 0015 15:11
 */
public class Waiter {

    private List<Command> orders = new ArrayList<>();

    public void setOrders(Command command){
        if(command.toString().contains("BakeChickenWingCommand")){
            System.out.println("服务员：鸡翅没有了，请点别的烧烤");
        }else {
            orders.add(command);
            System.out.println("增加订单："+command.toString()+" 时间："+ new Date().toString());
        }
    }

    public void cancelOrder(Command command){
        orders.remove(command);
        System.out.println("取消订单："+command.toString()+" 时间："+ new Date().toString());
    }

    public void notifyPeople(){
        for (Command order : orders) {
            order.excuteCommand();
        }
    }
}
