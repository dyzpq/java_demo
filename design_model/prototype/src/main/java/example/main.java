package example;

import example.prototype.Resune;
import example.prototype.WorkExperience;

/**
 * @author dengyang
 * @createdate 2019/11/5 0005 18:10
 */
public class main {
    public static void main(String[] args) {
        WorkExperience work = new WorkExperience("2019-07-05","测试公司");
        Resune r1 = new Resune("DY","男",25,work);

        Resune c1 = r1.clone();
        c1.setWork(new WorkExperience("2019-10-01","高新公司"));

        System.out.println(r1.getWork());
        System.out.println(c1.getWork());
    }
}
