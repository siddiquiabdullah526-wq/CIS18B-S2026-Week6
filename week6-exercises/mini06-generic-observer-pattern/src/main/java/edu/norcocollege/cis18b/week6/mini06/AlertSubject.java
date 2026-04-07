package edu.norcocollege.cis18b.week6.mini06;

import java.util.ArrayList;
import java.util.List;

public class AlertSubject<T> implements Subject<T> {

    private final List<Observer<T>> observers = new ArrayList<>();

    @Override
    public void subscribe(Observer<T> observer) {
        observers.add(observer);
    }

    @Override
    public void unsubscribe(Observer<T> observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(T event) {
        for (Observer<T> observer : List.copyOf(observers)) {
            observer.onUpdate(event);
        }
    }
}
