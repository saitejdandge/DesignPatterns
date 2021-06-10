package com.dpractise.decorator_pattern.decorators;

import com.dpractise.decorator_pattern.IComponent;
import com.dpractise.decorator_pattern.IDecorator;

public class CreamDecorator extends IDecorator {
    public CreamDecorator(IComponent iComponent) {
        super(iComponent);
    }

    @Override
    public String getDescription() {
        return "cream | " + this.getPrevComponent().getDescription() ;
    }

    @Override
    public int getCost() {
        return this.getPrevComponent().getCost() + 2;
    }
}
