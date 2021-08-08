package com.two;

/*
PROJECT NAME : design-patterns-java
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 7/29/2021 2:04 PM
*/

public class Singleton {
    private static Singleton instance;

    static {
        instance = new Singleton();
    }
    private Singleton() {
        System.out.println("Creating Singleton object ...");
    }
    public static Singleton getInstance() {
        return instance;
    }

    public void doSomething() {
        System.out.println("Hey ... Instance got created ...");
    }
}
