package example.handler;

import example.request.Request;

/**
 * @author dengyang
 * @createdate 2019/11/15 0015 15:56
 */
public class CommonManager extends Manager{

    public CommonManager(String name){
        super(name);
    }

    @Override
    public void requestApplications(Request request) {
      if(request.getRequestType().contains("请假") && request.getNumber()<=2){
          System.out.println(name+"："+request.getRequestContent()+"数量"+request.getNumber()+"被批准");
      }else if(superior != null){
          superior.requestApplications(request);
      }


    }
}
