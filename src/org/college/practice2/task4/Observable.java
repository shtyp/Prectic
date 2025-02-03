package org.college.practice2.task4;

import java.util.ArrayList;
import java.util.List;

public class Observable {
    private List<Observer> _observers = new ArrayList<>();

    public void subscribe(Observer observer) {
        _observers.add(observer);
    }

    public void unsubscribe(Observer observer) {
        _observers.remove(observer);
    }

    public void notifyObservers(SystemAlert alert) {
        for (Observer observer : _observers) {
            observer.notify(alert);
        }
    }
}

