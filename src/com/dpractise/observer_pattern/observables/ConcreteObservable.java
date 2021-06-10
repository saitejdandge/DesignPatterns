package com.dpractise.observer_pattern.observables;

import com.dpractise.observer_pattern.IObservable;
import com.dpractise.observer_pattern.IObserver;

import java.util.HashSet;

public class ConcreteObservable implements IObservable<Integer> {

    private final HashSet<IObserver<Integer>> observers;

    private Integer state;

    public ConcreteObservable() {
        this.observers = new HashSet<>();
        this.state = 0;
    }

    @Override
    public void addObserver(IObserver<Integer> iObserver) {
        this.observers.add(iObserver);
    }

    @Override
    public void removeObserver(IObserver<Integer> iObserver) {
        this.observers.remove(iObserver);
    }

    @Override
    public void notifyObservers() {
        for (IObserver<Integer> iObserver : this.observers) {
            iObserver.update();
        }
    }

    @Override
    public Integer getState() {
        return this.state;
    }

    @Override
    public void setState(Integer state) {
        this.state = state;
        this.notifyObservers();
    }
}
