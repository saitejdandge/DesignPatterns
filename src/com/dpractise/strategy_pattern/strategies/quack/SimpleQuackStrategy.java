package com.dpractise.strategy_pattern.strategies.quack;

import com.dpractise.strategy_pattern.IQuackStrategy;

public class SimpleQuackStrategy implements IQuackStrategy {
    @Override
    public void quack() {
        System.out.println("Simple Quack");
    }
}
