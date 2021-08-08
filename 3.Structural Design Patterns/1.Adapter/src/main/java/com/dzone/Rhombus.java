package com.dzone;

/*
PROJECT NAME : design-patterns-java
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/4/2021 12:56 AM
*/

import com.tools.ConsoleColors;

public class Rhombus implements GeometricShape{
    // Sides
    private final double a;
    private final double b;

    public Rhombus() {
        this(1.0d, 1.0d);
    }

    public Rhombus(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double area() {
        return a * b;
    }

    @Override
    public double perimeter() {
        return 2 * (a + b);
    }

    @Override
    public void drawShape() {
        System.out.println(ConsoleColors.ANSI_ORANGE + "Drawing Rhombus with area: " + area() + " and perimeter:" + perimeter());
    }
}
