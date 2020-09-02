package example.event_delegation.even;

import java.lang.reflect.Method;

/**
 * @author dengyang
 * @createdate 2019/11/6 0006 17:50
 */
public class Event {

    private Object object;
    private String methodName;
    private Object[] params;
    private Class[] paramTypes;

    public Event(Object object,String methodName,Object...args){
        this.object = object;
        this.methodName = methodName;
        this.params = args;
        contractParamType(this.params);
    }

    private void contractParamType(Object[] params){
        this.paramTypes = new Class[params.length];
        for(int i =0;i<params.length;i++){
            this.paramTypes[i] = params[i].getClass();
        }
    }

    public void invoke() throws Exception {
        Method method = object.getClass().getMethod(this.methodName,this.paramTypes);
        if(null == method){
            return;
        }
        method.invoke(this.object,this.params);
    }
}
