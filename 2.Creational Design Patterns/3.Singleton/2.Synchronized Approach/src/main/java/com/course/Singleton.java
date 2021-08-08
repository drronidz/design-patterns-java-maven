package com.course;

/*
PROJECT NAME : design-patterns-java
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 7/25/2021 4:32 PM
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

    // by adding the synchronized keyword to getInstance(),
    // we force every thread to wait its turn before it can enter the method.
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
