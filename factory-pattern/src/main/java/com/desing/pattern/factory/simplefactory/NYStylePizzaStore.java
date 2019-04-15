package com.desing.pattern.factory.simplefactory;

public class NYStylePizzaStore extends PizzaStore {


    protected Pizza createPizza(String type) {
        Pizza pizza=null;

        if(type.equals("pepperoni")){
            pizza=new PepperoniPizza();
        }
        else if(type.equals("cheese")){
            pizza=new CheesePizza();
        }
        return pizza;
    }
}
