package example.handler;

import example.request.Request;

/**
 * @author dengyang
 * @createdate 2019/11/15 0015 16:01
 */
public class Majordomo extends Manager{

    public Majordomo(String name){
        super(name);
    }

    @Override
    public void requestApplications(Request request) {
        if(request.getRequestType().contains("请假") && request.getNumber()<=5){
            System.out.println(name+"："+request.getRequestContent()+"数量"+request.getNumber()+"被批准");
        }else if(superior != null){
            superior.requestApplications(request);
        }
    }
}
