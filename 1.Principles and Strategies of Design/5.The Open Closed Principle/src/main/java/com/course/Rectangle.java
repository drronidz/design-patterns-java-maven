package com.course;

/*
PROJECT NAME : design-patterns-java
Author Name : @ DRRONIDZ
DATE : 7/21/2021 1:28 AM
*/

public class Rectangle implements Shape {
    public double length;
    public double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }
}
