package com.desing.pattern.strategy.quakbehavior;

public class Quack implements QuackBehavior {
    public void quack() {
        System.out.println("Duck quacking");
    }
}
