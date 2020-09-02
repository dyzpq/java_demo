package example;

import example.context.Work;
import example.state.ForenoonState;

/**
 * @author dengyang
 * @createdate 2019/11/7 0007 15:27
 */
public class main {
    public static void main(String[] args) {
        Work work = new Work();
        work.setState(new ForenoonState());
        work.setHour(9);
        work.writeProgram();

        work.setHour(10);
        work.writeProgram();

        work.setHour(12);
        work.writeProgram();

        work.setHour(13);
        work.writeProgram();

        work.setHour(14);
        work.writeProgram();

        work.setHour(17);
        work.setTaskFinish(true);
        //work.setTaskFinish(false);
        work.writeProgram();

        work.setHour(19);
        work.writeProgram();

        work.setHour(22);
        work.writeProgram();
    }
}
