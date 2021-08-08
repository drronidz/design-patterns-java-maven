package com.challenge;/*
PROJECT NAME : design-patterns-java
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/4/2021 4:39 PM
*/

public class Triangle extends Shape {

    public Triangle(Color color) {
        super(color);
    }

    // Implementer-specific method
    @Override
    void drawShape(int border) {
        System.out.println("This Triangle is colored with ");
        color.fillWithColor(border);
    }

    // Abstraction-specific method
    @Override
    void modifyBorder(int border, int increment) {
        System.out.println("\nNow we are changing the border length " + increment + " times");
        border = border * increment;
        drawShape(border);
    }
}
