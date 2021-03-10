package filter;

import filter.filter.AuthenticationFilter;
import filter.filter.DebugFilter;
import filter.filter.FilterManager;
import filter.target.Target;

/**
 * @Author coolDY
 * @Date 2021-03-10
 * 拦截过滤器演示
 */
public class InterceptingFilterDemo {
    public static void main(String[] args) {
        FilterManager filterManager = new FilterManager(new Target());
        filterManager.setFilter(new AuthenticationFilter());
        filterManager.setFilter(new DebugFilter());

        Client client = new Client();
        client.setFilterManager(filterManager);
        client.sendRequest("/login");
    }
}
