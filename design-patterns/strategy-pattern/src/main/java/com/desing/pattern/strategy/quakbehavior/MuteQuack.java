package com.desing.pattern.strategy.quakbehavior;

public class MuteQuack implements QuackBehavior {
    public void quack() {
        System.out.println("Can't Quack");
    }
}
