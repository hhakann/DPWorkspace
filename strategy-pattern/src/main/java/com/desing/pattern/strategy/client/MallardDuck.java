package com.desing.pattern.strategy.client;


import com.desing.pattern.strategy.flybehavior.FlyWithWings;
import com.desing.pattern.strategy.quakbehavior.Quack;

public class MallardDuck extends Duck {
    public MallardDuck() {
        quackBehavior=new Quack();
        flyBehavior=new FlyWithWings();
    }

    public void display() {
        System.out.println("I am a real Mallard Duck");

    }
}
