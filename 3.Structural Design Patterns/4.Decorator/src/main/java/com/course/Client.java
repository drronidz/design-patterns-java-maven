package com.course;

/*
PROJECT NAME : design-patterns-java
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/6/2021 3:53 PM
*/

public class Client {
    public static void main(String[] args) {
        System.out.println(" --------------- Decorator Pattern Demo ---------------");

        ConcreteComponent concreteComponent = new ConcreteComponent();

        AbstractDecorator concreteDecoratorOne = new ConcreteDecoratorOne();

        // Decorating ConcreteComponent Object concreteComponent with ConcreteDecoratorOne
        concreteDecoratorOne.setComponent(concreteComponent);
        concreteDecoratorOne.doJob();

        AbstractDecorator concreteDecoratorTwo = new ConcreteDecoratorTwo();
        // Decorating ConcreteComponent Object concreteComponent with ConcreteDecoratoroOne & ConcreteDecoratoroTwo
        concreteDecoratorTwo.setComponent(concreteDecoratorOne); // Adding results from concreteDecoratorOne now
        concreteDecoratorTwo.doJob();


    }
}
