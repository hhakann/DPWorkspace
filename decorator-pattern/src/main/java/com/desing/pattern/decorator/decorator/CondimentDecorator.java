package com.desing.pattern.decorator.decorator;

import com.desing.pattern.decorator.component.Beverage;

public abstract class CondimentDecorator extends Beverage {
    public abstract String getDescription();
}
