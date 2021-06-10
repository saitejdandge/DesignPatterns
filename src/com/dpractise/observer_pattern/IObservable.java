package com.dpractise.observer_pattern;

public interface IObservable<T> {

    void addObserver(IObserver<T> iObserver);

    void removeObserver(IObserver<T> iObserver);

    void notifyObservers();

    T getState();

    void setState(T state);
}
