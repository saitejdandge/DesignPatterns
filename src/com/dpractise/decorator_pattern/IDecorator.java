package com.dpractise.decorator_pattern;

public abstract class IDecorator extends IComponent {

    private final IComponent prevComponent;

    public IDecorator(IComponent prevComponent) {
        this.prevComponent = prevComponent;
    }

    protected IComponent getPrevComponent() {
        return prevComponent;
    }
}
