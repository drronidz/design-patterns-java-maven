package com.dzone;

/*
PROJECT NAME : design-patterns-java
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/4/2021 12:42 AM
*/

import com.tools.ConsoleColors;

public class Triangle implements GeometricShape{
    //Sides
    private final double a;
    private final double b;
    private final double c;

    public Triangle() {
        this(1.0d, 1.0d, 1.0d);
    }

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double area() {
        // Haron's Formula
        // Area = SquareRoot(s * (s - a) * (s - b) * (s - c))
        // Where s = (a + b + c) / 2, or 1/2 of the perimeter of the triangle
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    @Override
    public double perimeter() {
       return a + b + c;
    }

    @Override
    public void drawShape() {
        System.out.println(ConsoleColors.ANSI_CYAN + "Drawing Triangle with area: " + area() + " and perimeter: " + perimeter());
    }
}
