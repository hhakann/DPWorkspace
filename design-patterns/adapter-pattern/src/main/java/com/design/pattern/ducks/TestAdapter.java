package com.design.pattern.ducks;

public class TestAdapter {


    public static void main(String[] args) {

        Duck mallardDuck=new MallardDuck();
        Turkey turkey=new WildTurkey();
        Duck turkeyAdapter=new TurkeyAdapter(turkey);
        turkey.fly();
        turkey.gobble();

        System.out.println("\n");
        turkeyAdapter.fly();
        turkeyAdapter.quack();
        System.out.println("\n");
        System.out.println("\n");
        mallardDuck.quack();
        mallardDuck.fly();

        Turkey duckAdapter=new DuckAdapter(mallardDuck);
        duckAdapter.gobble();
        duckAdapter.fly();

    }


}
