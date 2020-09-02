package template.objectstructure;

import template.element.Element;
import template.visitor.Visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author dengyang
 * @createdate 2019/11/20 0020 10:19
 */
public class ObjectStructure {

    private List<Element> elements = new ArrayList<>();

    public void attach(Element element){
        elements.add(element);
    }

    public void detach(Element element){
        elements.remove(element);
    }

    public void accept(Visitor visitor){
        for (Element element : elements) {
            element.accept(visitor);
        }
    }
}
