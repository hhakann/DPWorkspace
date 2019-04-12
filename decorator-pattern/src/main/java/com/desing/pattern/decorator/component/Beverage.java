package com.desing.pattern.decorator.component;

public abstract class Beverage {
    String description="Unknown Beverage";

    public abstract double cost();

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
