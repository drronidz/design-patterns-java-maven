package com.medium;

/*
PROJECT NAME : design-patterns-java
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/5/2021 11:59 PM
*/

public interface Human {
    String getName();
    String getLastName();
    void print();
    void addChild(Human child);
    void addParent(Human parent);
}
