package example.subject;

import example.observer.Observer;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @author dengyang
 * @createdate 2019/11/6 0006 16:38
 */
@Data
public abstract class Subject {

    private String action;

    List<Observer> observers = new ArrayList<>();

    public void attch(Observer observer){
        observers.add(observer);
    }

    public void detach(Observer observer){
        observers.remove(observer);
    }

    public void notyfyPeople(){
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
