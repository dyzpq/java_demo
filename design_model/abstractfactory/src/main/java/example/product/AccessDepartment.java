package example.product;

/**
 * @author dengyang
 * @createdate 2019/11/7 0007 12:06
 */
public class AccessDepartment implements IDepartment {
    @Override
    public void insert(IDepartment department) {
        System.out.println("AccessDepartment插入");
    }

    @Override
    public IDepartment getDepartment(int id) {
        return null;
    }
}
