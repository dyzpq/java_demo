package example.state;

import example.context.Work;

/**
 * @author dengyang
 * @createdate 2019/11/7 0007 15:15
 */
public class EveningState extends State {
    @Override
    public void writeProgram(Work work) {
        if(work.getTaskFinish()){
            work.setState(new RestState());
            work.writeProgram();
        }
        else {
            if(work.getHour()<21){
                System.out.println("当前时间："+work.getHour()+"点，加班哦，疲惫之极");
            }else {
                work.setState(new SleepingState());
                work.writeProgram();
            }
        }
    }
}
