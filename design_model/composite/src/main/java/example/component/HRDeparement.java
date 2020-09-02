package example.component;

/**
 * @author dengyang
 * @createdate 2019/11/8 0008 11:25
 */
public class HRDeparement extends Company {

    public HRDeparement(String name){
       super(name);
    }
    @Override
    public void add(Company c) {

    }

    @Override
    public void remove(Company c) {

    }

    @Override
    public void display(int depth) {
        for (int i=1 ; i<=depth; i++){
            System.out.print("-");
        }
        System.out.println(name);
    }

    @Override
    public void lineOfDuty() {
        System.out.println(name+" 员工招聘培训管理");
    }
}
