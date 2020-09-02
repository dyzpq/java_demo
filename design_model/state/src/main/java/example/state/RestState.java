package example.state;

import example.context.Work;

/**
 * @author dengyang
 * @createdate 2019/11/7 0007 15:16
 */
public class RestState extends State {
    @Override
    public void writeProgram(Work work) {
        System.out.println("当前时间："+work.getHour()+"点，下班回家了");
    }
}
