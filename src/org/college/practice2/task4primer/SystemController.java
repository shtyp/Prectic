package org.college.practice2.task4primer;

import java.util.ArrayList;
import java.util.List;

class SystemController {
    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers(SystemAlert alert) {
        for (Observer observer : observers) {
            observer.notify(alert);
        }
    }
}

