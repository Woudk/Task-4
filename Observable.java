package org.colleg.practice2.task4;

import java.util.ArrayList;
import java.util.List;
public abstract class Observable {
    private List<Observer> observers = new ArrayList<>();

    public void subscribe(Observer observer) {
        observers.add(observer);
    }

    public void unsubscribe(Observer observer) {
        observers.remove(observer);
    }

    public void notifyAlert(SystemAlert alert) {
        for (Observer observer : observers) {
            observer.notify(alert);
        }
    }
}
