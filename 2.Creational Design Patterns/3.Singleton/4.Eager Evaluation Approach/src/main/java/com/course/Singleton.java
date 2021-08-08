package com.course;

/*
PROJECT NAME : design-patterns-java
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 7/26/2021 4:18 PM
*/

public class Singleton {
    // Create an instance of singleton in a static initializer, code is guaranteed to be thread safe.
    private static final Singleton uniqueInstance = new Singleton();

    private Singleton() {}

    public static Singleton getInstance() {
        // We already got an instance so just return it.
        return uniqueInstance;
    }
}
