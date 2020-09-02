package example.state;

import example.context.Work;

/**
 * @author dengyang
 * @createdate 2019/11/7 0007 15:15
 */
public class NoonState extends State {
    @Override
    public void writeProgram(Work work) {
        if(work.getHour()<13){
            System.out.println("当前时间："+work.getHour()+"点，饿了，午饭；犯困，午休");
        }
        else {
            work.setState(new AfternoonState());
            work.writeProgram();
        }
    }
}
