package com.course;

/*
PROJECT NAME : design-patterns-java
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/6/2021 3:57 PM
*/

public class ConcreteDecoratorOne extends AbstractDecorator {

    @Override
    public void doJob() {
        super.doJob();
        // Add additional responsibilities
        System.out.println("I am explicitly from " + getClass().getSimpleName());
    }
}
