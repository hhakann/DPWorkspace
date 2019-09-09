package com.desing.pattern.strategy;

import com.desing.pattern.strategy.client.Duck;
import com.desing.pattern.strategy.client.MallardDuck;
import com.desing.pattern.strategy.client.ModelDuck;
import com.desing.pattern.strategy.flybehavior.FlyWithWings;

public class RunApp {
    public static void main(String[] args) {
        Duck duck=new MallardDuck();
        Duck duck1=new ModelDuck();

        duck.performQuack();
        duck.performFly();
        duck.display();
        duck.swim();
        System.out.println("\n");

        duck1.performFly();
        duck1.performQuack();
        duck1.setFlyBehavior(new FlyWithWings());
        duck1.display();
        duck1.performFly();


    }


}
