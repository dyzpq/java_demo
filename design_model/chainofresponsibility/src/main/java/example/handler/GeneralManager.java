package example.handler;

import example.request.Request;

/**
 * @author dengyang
 * @createdate 2019/11/15 0015 16:02
 */
public class GeneralManager extends Manager {

    public GeneralManager(String name){
        super(name);
    }

    @Override
    public void requestApplications(Request request) {
        if(request.getRequestType().contains("请假")){
            System.out.println(name+"："+request.getRequestContent()+"数量"+request.getNumber()+"被批准");
        }else if(request.getRequestType().contains("加薪") && request.getNumber()<=500){
            System.out.println(name+"："+request.getRequestContent()+"数量"+request.getNumber()+"被批准");
        }else if(request.getRequestType().contains("加薪") && request.getNumber()>500){
            System.out.println(name+"："+request.getRequestContent()+"数量"+request.getNumber()+"再说吧");
        }
    }
}
