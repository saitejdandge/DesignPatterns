package com.dpractise.observer_pattern.observers;

import com.dpractise.observer_pattern.IObservable;
import com.dpractise.observer_pattern.IObserver;

public class DesktopObserver implements IObserver<Integer> {

    private final IObservable<Integer> iObservable;

    public DesktopObserver(IObservable<Integer> iObservable) {
        this.iObservable = iObservable;
    }

    @Override
    public void update() {
        System.out.println("Desktop::" + iObservable.getState());
    }
}
