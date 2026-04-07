package edu.norcocollege.cis18b.week6.mini06;

@FunctionalInterface
public interface Observer<T> {

    void onUpdate(T event);
}
