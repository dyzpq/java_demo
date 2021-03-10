package filter.filter;


/**
 * @Author coolDY
 * @Date 2021-03-10
 *
 * 具体过滤器
 */
public class DebugFilter implements Filter {

    @Override
    public void execute(String request) {
        System.out.println("DebugFilter execute() --->"+request);
    }
}
