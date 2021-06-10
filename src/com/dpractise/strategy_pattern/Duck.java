package com.dpractise.strategy_pattern;

public abstract class Duck {
    private final IFlyStrategy iFlyStrategy;
    private final IQuackStrategy iQuackStrategy;

    public Duck(IFlyStrategy iFlyStrategy, IQuackStrategy iQuackStrategy) {
        this.iFlyStrategy = iFlyStrategy;
        this.iQuackStrategy = iQuackStrategy;
    }

    protected final void fly() {
        this.iFlyStrategy.fly();
    }

    protected final void quack() {
        this.iQuackStrategy.quack();
    }

}
