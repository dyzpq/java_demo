package example.state;

import example.context.Work;

/**
 * @author dengyang
 * @createdate 2019/11/7 0007 15:12
 */
public class ForenoonState extends State {
    @Override
    public void writeProgram(Work work) {
        if(work.getHour()<12){
            System.out.println("当前时间："+work.getHour()+"点，上午工作，精神百倍");
        }
        else {
            work.setState(new NoonState());
            work.writeProgram();
        }
    }
}
