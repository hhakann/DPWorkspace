package com.design.pattern.ducks;

public class DuckAdapter implements Turkey {
    Duck duck;

    public DuckAdapter(Duck duck) {
        this.duck = duck;
    }

    public void fly() {
        duck.fly();
    }

    public void gobble() {
        duck.quack();
    }
}
