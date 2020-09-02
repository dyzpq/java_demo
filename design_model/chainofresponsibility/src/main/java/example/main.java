package example;

import example.handler.CommonManager;
import example.handler.GeneralManager;
import example.handler.Majordomo;
import example.handler.Manager;
import example.request.Request;

/**
 * @author dengyang
 * @createdate 2019/11/15 0015 16:06
 */
public class main {
    public static void main(String[] args) {
        Manager jinli = new CommonManager("经理");
        Manager zongjian = new Majordomo("总监");
        Manager zongjinli = new GeneralManager("总经理");
        jinli.setSuperior(zongjian);
        zongjian.setSuperior(zongjinli);

        Request request = new Request();
        request.setRequestType("请假");
        request.setRequestContent("DY请假");
        request.setNumber(1);
        jinli.requestApplications(request);

        Request request1 = new Request();
        request1.setRequestType("请假");
        request1.setRequestContent("DY请假");
        request1.setNumber(4);
        jinli.requestApplications(request1);

        Request request2 = new Request();
        request2.setRequestType("加薪");
        request2.setRequestContent("DY请求加薪");
        request2.setNumber(500);
        jinli.requestApplications(request2);

        Request request3 = new Request();
        request3.setRequestType("加薪");
        request3.setRequestContent("DY请求加薪");
        request3.setNumber(10000);
        jinli.requestApplications(request3);
    }
}
