package com.dpractise.decorator_pattern.decorators;

import com.dpractise.decorator_pattern.IComponent;
import com.dpractise.decorator_pattern.IDecorator;

public class CaramelDecorator extends IDecorator {
    public CaramelDecorator(IComponent iComponent) {
        super(iComponent);
    }

    @Override
    public String getDescription() {
        return "caramel | " + this.getPrevComponent().getDescription();
    }

    @Override
    public int getCost() {
        return this.getPrevComponent().getCost() + 3;
    }
}
