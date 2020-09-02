package example.flyweightfactiry;

import example.flyweight.ConcreteWebSite;
import example.flyweight.WebSite;

import java.util.Hashtable;

/**
 * @author dengyang
 * @createdate 2019/11/15 0015 17:28
 */
public class WebSiteFactory {

    private Hashtable flyweights = new Hashtable();

    public WebSite getWebSiteCategory(String key){
        if(!flyweights.containsKey(key)){
            flyweights.put(key,new ConcreteWebSite(key));
        }
        return (WebSite)flyweights.get(key);
    }

    public int getWebSiteCount(){
        return flyweights.size();
    }
}
