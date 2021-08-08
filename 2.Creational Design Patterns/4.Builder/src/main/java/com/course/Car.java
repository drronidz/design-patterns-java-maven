package com.course;/*
PROJECT NAME : design-patterns-java
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 7/28/2021 2:22 PM
*/

public class Car implements Builder {
    private Product product = new Product();
    @Override
    public void buildBody() {
        product.add("This is a body of a car.");
    }

    @Override
    public void insertWheels() {
        product.add("4 wheels are added.");
    }

    @Override
    public void addHeadlights() {
        product.add("2 headlights are added.");
    }

    @Override
    public Product getVehicle() {
        return product;
    }
}
