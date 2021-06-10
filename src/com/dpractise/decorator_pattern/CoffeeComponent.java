package com.dpractise.decorator_pattern;

public class CoffeeComponent extends IComponent {
    @Override
    public String getDescription() {
        return "Coffee";
    }

    @Override
    public int getCost() {
        return 10;
    }
}
