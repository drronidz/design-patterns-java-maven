package com.one;

/*
PROJECT NAME : design-patterns-java
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 7/29/2021 1:12 AM
*/

public enum Singleton {
    // Java ensures that any enum value is instantiated only once in a Java program
    INSTANCE;

    int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
