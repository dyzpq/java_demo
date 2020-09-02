package example.objectstruture;

import example.element.Person;
import example.visitor.Action;

import java.util.ArrayList;
import java.util.List;

/**
 * @author dengyang
 * @createdate 2019/11/20 0020 10:37
 */
public class ObjectStructure {
    private List<Person> elements = new ArrayList<>();

    public void attach(Person element){
        elements.add(element);
    }

    public void detach(Person element){
        elements.remove(element);
    }

    public void display(Action visitor){
        for (Person element : elements) {
            element.accept(visitor);
        }
    }
}
