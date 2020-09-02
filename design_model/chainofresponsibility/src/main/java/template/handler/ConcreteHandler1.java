package template.handler;

/**
 * @author dengyang
 * @createdate 2019/11/15 0015 15:44
 */
public class ConcreteHandler1 extends Handler {

    @Override
    public void handleRequest(int request) {
        if(request>=0 && request<10){
            System.out.println(this.getClass().getSimpleName()+"处理请求"+request);
        }else if(succerssor != null){
            succerssor.handleRequest(request);
        }
    }
}
