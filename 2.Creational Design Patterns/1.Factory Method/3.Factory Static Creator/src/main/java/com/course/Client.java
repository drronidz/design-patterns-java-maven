package com.course;

/*
PROJECT NAME : design-patterns-java
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 7/23/2021 1:32 AM
*/

import com.course.Shape.Shape;
import com.course.factory.ShapeFactory;

public class Client {
    public static void main(String[] args) {

        // Get an object of Circle and call its draw method.
        Shape circle = ShapeFactory.getShape("CIRCLE");
        // call draw method of Circle
        circle.draw();

        // Get an object of Rectangle and call its draw method.
        Shape rectangle = ShapeFactory.getShape("RECTANGLE");
        // call draw method of Rectangle
        rectangle.draw();

        // Get an object of Square and call its draw method.
        Shape square = ShapeFactory.getShape("SQUARE");
        // call draw method of Square
        square.draw();
    }
}
