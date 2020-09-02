package example.component;

/**
 * @author dengyang
 * @createdate 2019/11/8 0008 11:19
 */
public abstract class Company {
    protected String name;

    public Company(String name){
        this.name = name;
    }

    public abstract void add(Company c);
    public abstract void remove(Company c);
    public abstract void display(int depth);
    public abstract void lineOfDuty();
}
