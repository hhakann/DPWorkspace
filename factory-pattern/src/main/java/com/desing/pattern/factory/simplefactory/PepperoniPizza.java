package com.desing.pattern.factory.simplefactory;

public class PepperoniPizza extends Pizza{

    public PepperoniPizza() {
        name="Pepperoni Pizza";
        dough="Crust";
        sauce="Marinara Sauce";
        toppings.add("Sliced pepperoni");
        toppings.add("Sliced Onion");
        toppings.add("Grated parmesan cheese");

    }

    @Override
    void bake() {
        System.out.println("50 minutes wait ");
    }
}


