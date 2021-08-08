package com.challenge;/*
PROJECT NAME : design-patterns-java
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/4/2021 4:42 PM
*/

public class Rectangle extends Shape {
    public Rectangle(Color color) {
        super(color);
    }

    @Override
    void drawShape(int border) {
        System.out.println("This Rectangle is colored with ");
        color.fillWithColor(border);
    }

    @Override
    void modifyBorder(int border, int increment) {
        System.out.println("\nNow we are changing the border length " + increment + " times");
        border = border * increment;
        drawShape(border);
    }
}
