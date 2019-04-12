package com.desing.pattern.strategy.flybehavior;

public class FlyNoWay implements FlyBehavior {

    public void fly() {
        System.out.println("Duck can't fly ");
    }
}
