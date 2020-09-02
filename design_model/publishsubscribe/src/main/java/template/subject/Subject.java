package template.subject;

import template.observer.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author dengyang
 * @createdate 2019/11/6 0006 15:56
 */
public abstract class Subject {

    private List<Observer> observers = new ArrayList<>();

    public void attach(Observer observer){
        observers.add(observer);
    }

    public void detach(Observer observer){
        observers.remove(observer);
    }

    public void notifyPeople(){
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
