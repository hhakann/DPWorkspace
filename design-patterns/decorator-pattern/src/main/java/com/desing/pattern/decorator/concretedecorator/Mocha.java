package com.desing.pattern.decorator.concretedecorator;

import com.desing.pattern.decorator.component.Beverage;
import com.desing.pattern.decorator.decorator.CondimentDecorator;

public class Mocha extends CondimentDecorator {
    Beverage beverage;


    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    public double cost() {
        return .20+beverage.cost();
    }



    public String getDescription() {
        return beverage.getDescription()+", Mocha";
    }
}
