package com.desing.pattern.decorator.concretecomponent;

import com.desing.pattern.decorator.component.Beverage;

public class Espresso  extends Beverage {
    public Espresso() {
      setDescription("Espresso");
    }

    public double cost() {
        return 1.99;
    }
}
