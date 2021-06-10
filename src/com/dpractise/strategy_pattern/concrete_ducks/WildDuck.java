package com.dpractise.strategy_pattern.concrete_ducks;

import com.dpractise.strategy_pattern.Duck;
import com.dpractise.strategy_pattern.strategies.fly.SimpleFlyStrategy;
import com.dpractise.strategy_pattern.strategies.quack.NoQuackStrategy;

public class WildDuck extends Duck {

    public WildDuck() {
        super(new SimpleFlyStrategy(), new NoQuackStrategy());
    }
}
