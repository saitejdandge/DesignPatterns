package com.dpractise.strategy_pattern.concrete_ducks;

import com.dpractise.strategy_pattern.Duck;
import com.dpractise.strategy_pattern.strategies.fly.NoFlyStrategy;
import com.dpractise.strategy_pattern.strategies.quack.NoQuackStrategy;

public class VillageDuck extends Duck {
    public VillageDuck() {
        super(new NoFlyStrategy(), new NoQuackStrategy());
    }

}
