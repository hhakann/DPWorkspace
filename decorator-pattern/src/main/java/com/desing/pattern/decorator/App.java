package com.desing.pattern.decorator;

import com.desing.pattern.decorator.component.Beverage;
import com.desing.pattern.decorator.concretecomponent.DarkRoast;
import com.desing.pattern.decorator.concretecomponent.Espresso;
import com.desing.pattern.decorator.concretedecorator.Milk;
import com.desing.pattern.decorator.concretedecorator.Mocha;
import com.desing.pattern.decorator.concretedecorator.Whip;

public class App {

    public static void main(String[] args) {
        Beverage beverage=new Espresso();
        System.out.println(beverage.getDescription()+ "$ " +beverage.cost());

        Beverage beverage1=new DarkRoast();
        beverage1=new Mocha(beverage1);
        beverage1=new Whip(beverage1);
        beverage1=new Milk(beverage1);

        System.out.println(beverage1.getDescription()+"$ "+beverage1.cost());
    }
}
