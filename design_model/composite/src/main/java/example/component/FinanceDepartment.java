package example.component;

/**
 * @author dengyang
 * @createdate 2019/11/8 0008 11:26
 */
public class FinanceDepartment extends Company {

    public FinanceDepartment(String name){
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
        System.out.println(name+" 公司财务收支管理");
    }
}
