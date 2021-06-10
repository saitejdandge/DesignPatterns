package com.dpractise.observer_pattern;

import com.dpractise.observer_pattern.observables.ConcreteObservable;
import com.dpractise.observer_pattern.observers.DesktopObserver;
import com.dpractise.observer_pattern.observers.PhoneObserver;

public class Main {
    public static void main(String[] args) {
        ConcreteObservable concreteObservable = new ConcreteObservable();

        PhoneObserver phoneObserver = new PhoneObserver(concreteObservable);
        DesktopObserver desktopObserver = new DesktopObserver(concreteObservable);

        concreteObservable.addObserver(phoneObserver);
        concreteObservable.addObserver(desktopObserver);

        for (int i = 0; i < 1000; i++)
            concreteObservable.setState(i);
    }
}
