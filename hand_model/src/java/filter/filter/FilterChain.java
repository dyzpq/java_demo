package filter.filter;

import filter.target.Target;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author coolDY
 * @Date 2021-03-10
 *
 * 过滤器链
 *
 */
public class FilterChain {
    private List<Filter> filters = new ArrayList<>();
    private Target target;

    public void addFilter(Filter filter){
        filters.add(filter);
    }

    public void execute(String request){
        for (Filter filter : this.filters) {
            filter.execute(request);
        }
        this.target.execute(request);
    }

    public void setTarget(Target target){
        this.target = target;
    }
}
