package com.javapoint;

/*
PROJECT NAME : design-patterns-java
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/7/2021 1:10 AM
*/

public class BasicFood implements Food {

    @Override
    public String prepareFood() {
        return "Basic Food";
    }

    @Override
    public double foodPrice() {
        return 50.00;
    }
}
