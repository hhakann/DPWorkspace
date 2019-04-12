package com.desing.pattern.strategy.client;

import com.desing.pattern.strategy.flybehavior.FlyNoWay;
import com.desing.pattern.strategy.quakbehavior.Quack;

public class ModelDuck extends Duck {
    public ModelDuck() {
        quackBehavior=new Quack();
        flyBehavior=new FlyNoWay();
    }

    public void display() {
        System.out.println("I am a model Duck");
    }
}
