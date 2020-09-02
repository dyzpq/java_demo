package template.handler;

/**
 * @author dengyang
 * @createdate 2019/11/15 0015 15:47
 */
public class ConcreteHandler2 extends Handler {
    @Override
    public void handleRequest(int request) {
        if(request>=10 && request<20){
            System.out.println(this.getClass().getSimpleName()+"处理请求"+request);
        }else if(succerssor != null){
            succerssor.handleRequest(request);
        }
    }
}
