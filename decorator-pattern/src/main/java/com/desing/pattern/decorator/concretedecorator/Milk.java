package com.desing.pattern.decorator.concretedecorator;

import com.desing.pattern.decorator.component.Beverage;
import com.desing.pattern.decorator.decorator.CondimentDecorator;

public class Milk extends CondimentDecorator {

    Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    public double cost() {
        return .15+beverage.cost();
    }

    public String getDescription() {
        return beverage.getDescription()+" , Milk ";
    }
}
