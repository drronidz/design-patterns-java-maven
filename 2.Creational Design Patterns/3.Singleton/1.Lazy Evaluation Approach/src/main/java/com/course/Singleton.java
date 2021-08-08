package com.course;

/*
PROJECT NAME : design-patterns-java
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 7/25/2021 4:32 PM
*/

public class Singleton {
    // The private reference o the one and only instance.
    private static Singleton uniqueInstance = null;

    // An instance attribute
    private int data = 0;

    /*
    * The Singleton Constructor
    * Note that it is private!
    * No client can instantiate a Singleton object!
    * */

    private Singleton() {}

    public static Singleton getInstance() {
        if(uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }

    // Adding a set data here

    public void setData(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

}
