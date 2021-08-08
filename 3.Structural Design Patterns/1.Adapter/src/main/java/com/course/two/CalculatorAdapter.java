package com.course.two;

/*
PROJECT NAME : design-patterns-java
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/2/2021 4:44 PM
*/



public class CalculatorAdapter implements CalculatorInterface {

    Calculator calculator;
    Triangle t;

    public CalculatorAdapter(Triangle triangle) {
        t = triangle;
    }

    @Override
    public double getArea(Rectangle r) {
        calculator = new Calculator();

        Rectangle rectangle = new Rectangle();

        rectangle.length = t.base;
        rectangle.width = 0.5 * t.height;

        return calculator.getArea(rectangle);
    }
}
