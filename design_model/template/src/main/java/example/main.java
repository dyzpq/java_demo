package example;

import example.template.TestPaper;
import example.template.TestPaperA;
import example.template.TestPaperB;

/**
 * @author dengyang
 * @createdate 2019/11/6 0006 10:40
 */
public class main {
    public static void main(String[] args) {
        TestPaper t;

        t = new TestPaperA();
        t.testQuestion1();
        t.testQuestion2();
        t.testQuestion3();

        t = new TestPaperB();
        t.testQuestion1();
        t.testQuestion2();
        t.testQuestion3();
    }
}
