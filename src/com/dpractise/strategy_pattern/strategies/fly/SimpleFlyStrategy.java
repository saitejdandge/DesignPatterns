package com.dpractise.strategy_pattern.strategies.fly;

import com.dpractise.strategy_pattern.IFlyStrategy;

public class SimpleFlyStrategy implements IFlyStrategy {
    @Override
    public void fly() {
        System.out.println("simple flying");
    }
}
