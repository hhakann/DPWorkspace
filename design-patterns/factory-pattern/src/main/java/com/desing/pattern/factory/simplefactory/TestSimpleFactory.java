package com.desing.pattern.factory.simplefactory;

public class TestSimpleFactory {

    public static void main(String[] args) {
        PizzaStore store=new NYStylePizzaStore();
        PizzaStore pizzaStore=new ChicagoStylePizzaStore();
        SimplePizzaFactory simplePizzaFactory=new SimplePizzaFactory();

        Pizza pizza=store.orderPizza("cheese");
        System.out.println( "   "+pizza.getName());
        System.out.println("\n\n\n\n");
        Pizza pizza1=pizzaStore.orderPizza("veggie");
        System.out.println(" " +pizza1.getName());

        System.out.println("\n\n\n\n");
        Pizza p=simplePizzaFactory.createPizza("pepperoni");
        System.out.println("  "+p.getName());


    }
    
}
