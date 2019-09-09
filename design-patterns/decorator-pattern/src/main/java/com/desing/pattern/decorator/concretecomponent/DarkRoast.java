package com.desing.pattern.decorator.concretecomponent;

import com.desing.pattern.decorator.component.Beverage;

public class DarkRoast extends Beverage {
    public DarkRoast() {
        setDescription("DArk Roast Coffee");
    }

    public double cost() {
        return .99;
    }
}
