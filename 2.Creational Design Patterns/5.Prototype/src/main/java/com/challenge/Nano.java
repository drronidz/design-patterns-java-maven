package com.challenge;/*
PROJECT NAME : design-patterns-java
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 7/30/2021 11:36 PM
*/

public class Nano extends BasicCar {

    public Nano(String model) {
        modelName = model;
    }

    @Override
    public Nano clone()  {
        Nano clone = null;
        clone = (Nano) super.clone();
        return clone;
    }
}
