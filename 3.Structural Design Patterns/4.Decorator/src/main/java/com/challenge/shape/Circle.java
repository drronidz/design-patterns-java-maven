package com.challenge.shape;

/*
PROJECT NAME : design-patterns-java
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/6/2021 4:27 PM
*/

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Shape: " + getClass().getSimpleName());
    }
}
