package filter;

import filter.filter.FilterManager;

/**
 * @Author coolDY
 * @Date 2021-03-10
 * 客户端
 */
public class Client {

    private FilterManager filterManager;

    public void setFilterManager(FilterManager filterManager){
        this.filterManager = filterManager;
    }

    public void sendRequest(String request){
        filterManager.filterRequest(request);
    }
}
