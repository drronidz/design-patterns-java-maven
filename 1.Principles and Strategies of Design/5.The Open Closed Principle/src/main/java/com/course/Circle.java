package com.course;

/*
PROJECT NAME : design-patterns-java
Author Name : @ DRRONIDZ
DATE : 7/21/2021 1:29 AM
*/

public class Circle implements Shape {
    public double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return 22/7 * radius * radius;
    }
}
