package filter.filter;

import filter.target.Target;

/**
 * @Author coolDY
 * @Date 2021-03-10
 *
 * 过滤器管理器
 */
public class FilterManager {

    private FilterChain filterChain;

    public FilterManager(Target target){
        filterChain = new FilterChain();
        filterChain.setTarget(target);
    }

    public void setFilter(Filter filter){
        filterChain.addFilter(filter);
    }

    public void filterRequest(String request){
        filterChain.execute(request);
    }
}
