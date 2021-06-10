package com.dpractise.decorator_pattern;

import com.dpractise.decorator_pattern.decorators.CaramelDecorator;
import com.dpractise.decorator_pattern.decorators.CreamDecorator;

public class Main {

    public static void main(String[] args) {
        CoffeeComponent coffeeComponent = new CoffeeComponent();
        IComponent iComponent = new CaramelDecorator(new CreamDecorator(coffeeComponent));
        System.out.println(iComponent.getDescription());
    }
}
