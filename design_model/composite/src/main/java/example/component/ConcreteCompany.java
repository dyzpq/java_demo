package example.component;

import template.component.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @author dengyang
 * @createdate 2019/11/8 0008 11:21
 */
public class ConcreteCompany extends Company {

    private List<Company> children = new ArrayList<>();

    public ConcreteCompany(String name){
        super(name);
    }

    @Override
    public void add(Company c) {
        children.add(c);
    }

    @Override
    public void remove(Company c) {
        children.add(c);
    }

    @Override
    public void display(int depth) {
        for (int i=1 ; i<=depth; i++){
            System.out.print("-");
        }
        System.out.println(name);

        for (Company child : children) {
            child.display(depth+2);
        }
    }

    @Override
    public void lineOfDuty() {
        for (Company child : children) {
            child.lineOfDuty();
        }
    }
}
