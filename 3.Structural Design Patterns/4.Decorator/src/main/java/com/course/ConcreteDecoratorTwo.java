package com.course;

/*
PROJECT NAME : design-patterns-java
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/6/2021 4:00 PM
*/

public class ConcreteDecoratorTwo extends AbstractDecorator{

    @Override
    public void doJob() {
        System.out.println("");
        System.out.println(" --------- START Of Two ---------");

        super.doJob();

        // Add additional responsibilities
        System.out.println("I am explicitly from " + getClass().getSimpleName());
        System.out.println(" --------- END Of Two ---------");
        System.out.println("");
    }
}
