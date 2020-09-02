package example.flyweight;

import example.user.User;

/**
 * @author dengyang
 * @createdate 2019/11/15 0015 17:31
 */
public class ConcreteWebSite extends WebSite {

    private String name = "";

    public ConcreteWebSite(String name){
        this.name = name;
    }

    @Override
    public void use(User user) {
        System.out.println("网站分类："+name+" 用户"+user.getName());
    }
}
