package com.desing.pattern.factory.simplefactory;

public class ChicagoStylePizzaStore extends PizzaStore {
    protected Pizza createPizza(String type) {
        Pizza pizza=null;

        if(type.equals("veggie")){
            pizza=new VeggiePizza();
        }
        return pizza;
    }
}
