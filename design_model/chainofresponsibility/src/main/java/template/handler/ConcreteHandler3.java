package template.handler;

/**
 * @author dengyang
 * @createdate 2019/11/15 0015 15:48
 */
public class ConcreteHandler3 extends Handler {
    @Override
    public void handleRequest(int request) {
        if(request>=20 && request<30){
            System.out.println(this.getClass().getSimpleName()+"处理请求"+request);
        }else if(succerssor != null){
            succerssor.handleRequest(request);
        }
    }
}
