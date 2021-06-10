package com.dpractise.strategy_pattern.strategies.fly;

import com.dpractise.strategy_pattern.IFlyStrategy;

public class NoFlyStrategy implements IFlyStrategy {
    @Override
    public void fly() {
        System.out.println("not flying");
    }
}
