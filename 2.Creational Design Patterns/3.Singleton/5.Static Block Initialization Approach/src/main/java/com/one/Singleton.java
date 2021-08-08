package com.one;

/*
PROJECT NAME : design-patterns-java
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 7/28/2021 11:49 PM
*/

public class Singleton {
    // The private reference o the one and only instance.
    private static Singleton uniqueInstance ;

    // An instance attribute
    private int data = 0;

    /*
     * The Singleton Constructor
     * Note that it is private!
     * No client can instantiate a Singleton object!
     * */

    private Singleton() {}

    // Static block initialization for exception handling

    static {
        try {
            uniqueInstance = new Singleton();
        } catch (Exception e) {
            throw new RuntimeException("Exception occurred in creating singleton instance");
        }
    }

    public static Singleton getInstance() {
        return uniqueInstance;
    }

    // Adding a set data here :

    public void setData(int data) {
        this.data = data;
    }

    // Adding a get data here :

    public int getData() {
        return data;
    }
}
