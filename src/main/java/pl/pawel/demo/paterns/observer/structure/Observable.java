package pl.pawel.demo.paterns.observer.structure;

import java.util.List;

public class Observable {
    List<Observer> observers;
    public void addObserver(Observer o) {
        observers.add(o);
    }
    public void removeObserver(Observer o) {
        observers.remove(o);
    }
    public void notifyObserver() {
        observers.forEach(o -> o.update());
    }
}


