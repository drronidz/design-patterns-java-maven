package com.course.two;

/*
PROJECT NAME : design-patterns-java
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/2/2021 4:43 PM
*/



public class Calculator implements CalculatorInterface {

    Rectangle rectangle;

    @Override
    public double getArea(Rectangle rectangle) {
        this.rectangle = rectangle;
        return rectangle.length * rectangle.width;
    }
}
