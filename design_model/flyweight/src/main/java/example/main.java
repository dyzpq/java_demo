package example;

import example.flyweight.WebSite;
import example.flyweightfactiry.WebSiteFactory;
import example.user.User;

/**
 * @author dengyang
 * @createdate 2019/11/15 0015 17:36
 */
public class main {
    public static void main(String[] args) {
        WebSiteFactory f = new WebSiteFactory();

        WebSite fx = f.getWebSiteCategory("产品展示");
        fx.use(new User("DY"));

        WebSite fy = f.getWebSiteCategory("产品展示");
        fy.use(new User("YYL"));

        WebSite fz = f.getWebSiteCategory("博客");
        fz.use(new User("HL"));

        WebSite fm = f.getWebSiteCategory("博客");
        fm.use(new User("ZY"));

        System.out.println("得到网站分类总数为："+f.getWebSiteCount());
    }
}
