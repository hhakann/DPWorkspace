package com.desing.pattern.decorator.concretecomponent;

import com.desing.pattern.decorator.component.Beverage;

public class Decaf extends Beverage {
    public Decaf() {
        setDescription("Decaf Coffee ");
    }

    public double cost() {
        return 1.05;
    }
}
