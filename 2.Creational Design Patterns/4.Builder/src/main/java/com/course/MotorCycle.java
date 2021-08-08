package com.course;/*
PROJECT NAME : design-patterns-java
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 7/28/2021 2:24 PM
*/

public class MotorCycle implements Builder {

    private Product product = new Product();

    @Override
    public void buildBody() {
        product.add("This is a body of a car.");
    }

    @Override
    public void insertWheels() {
        product.add("2 wheels are added.");
    }

    @Override
    public void addHeadlights() {
        product.add("1 Headlights are added.");
    }

    @Override
    public Product getVehicle() {
        return product;
    }
}
