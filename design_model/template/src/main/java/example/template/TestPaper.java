package example.template;

/**
 * @author dengyang
 * @createdate 2019/11/6 0006 10:39
 */
public abstract class TestPaper {

    public abstract void answer1();

    public abstract void answer2();

    public abstract void answer3();

    public void testQuestion1(){
        System.out.print("问题1：");
        answer1();
    }
    public void testQuestion2(){
        System.out.print("问题2：");
        answer2();
    }
    public void testQuestion3(){
        System.out.print("问题3：");
        answer3();
    }
}
