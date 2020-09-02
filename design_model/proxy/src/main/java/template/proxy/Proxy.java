package template.proxy;

import template.subject.RealSubject;
import template.subject.Subject;

/**
 * @author dengyang
 * @createdate 2019/11/5 0005 16:02
 * 代理模式
 */
public class Proxy extends Subject {

    RealSubject realSubject;

    @Override
    public void Request() {
        if(null == realSubject){
            realSubject = new RealSubject();
        }
        realSubject.Request();
    }
}
