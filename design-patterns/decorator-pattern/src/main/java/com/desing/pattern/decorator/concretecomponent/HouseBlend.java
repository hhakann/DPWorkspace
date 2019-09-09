package com.desing.pattern.decorator.concretecomponent;

import com.desing.pattern.decorator.component.Beverage;

public class HouseBlend extends Beverage {

    public HouseBlend() {
        setDescription("House Blend Coffee");

    }


    public double cost() {
        return .89;
    }
}
