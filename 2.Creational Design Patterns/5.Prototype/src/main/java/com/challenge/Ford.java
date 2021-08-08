package com.challenge;/*
PROJECT NAME : design-patterns-java
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 7/30/2021 11:35 PM
*/

public class Ford extends BasicCar {
    public Ford(String model) {
        modelName = model;
    }

    @Override
    public Ford clone()  {
        Ford clone = null;
        clone = (Ford) super.clone();
        return clone;
    }
}
