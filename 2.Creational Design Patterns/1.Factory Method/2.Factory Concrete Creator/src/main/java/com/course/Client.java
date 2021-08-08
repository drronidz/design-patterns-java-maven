package com.course;

/*
PROJECT NAME : design-patterns-java
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 7/22/2021 8:15 PM
*/

import com.course.factory.ShapeFactory;
import com.course.shape.Shape;

public class Client {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        // Get an object of Circle and call its draw method.
        Shape circle = shapeFactory.getShape("CIRCLE");
        // Call draw method of Circle
        circle.draw();

        // Get an object of Square and call its draw method.
        Shape square = shapeFactory.getShape("SQUARE");
        // Call draw method of Square
        square.draw();

        // Get an object of Rectangle and call its draw method.
        Shape rectangle = shapeFactory.getShape("RECTANGLE");
        // Call draw method of Rectangle
        rectangle.draw();

    }
}
