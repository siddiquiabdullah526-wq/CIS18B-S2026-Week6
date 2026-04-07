package edu.norcocollege.cis18b.week6.mini06;

public interface Subject<T> {

    void subscribe(Observer<T> observer);

    void unsubscribe(Observer<T> observer);

    void notifyObservers(T event);
}
