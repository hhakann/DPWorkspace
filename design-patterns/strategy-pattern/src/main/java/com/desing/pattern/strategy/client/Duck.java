package com.desing.pattern.strategy.client;

import com.desing.pattern.strategy.flybehavior.FlyBehavior;
import com.desing.pattern.strategy.quakbehavior.Quack;
import com.desing.pattern.strategy.quakbehavior.QuackBehavior;

public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public abstract void display();

    public void swim(){
        System.out.println("All ducks float ,even decoys!!");

    }
    public void performQuack(){
        quackBehavior.quack();

    }
    public void performFly(){
        flyBehavior.fly();
    }

    public FlyBehavior getFlyBehavior() {
        return flyBehavior;
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public QuackBehavior getQuackBehavior() {
        return quackBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
