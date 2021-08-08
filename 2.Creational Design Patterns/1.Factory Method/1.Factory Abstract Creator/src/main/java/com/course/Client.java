package com.course;

/*
PROJECT NAME : design-patterns-java
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 7/21/2021 5:19 PM
*/

import com.course.factory.CircleFactory;
import com.course.factory.RectangleFactory;
import com.course.factory.SquareFactory;
import com.course.shape.Shape;

public class Client {
    public static void main(String[] args) {

        // Get an object of Circle and call its draw method.
        Shape shapeOne = new CircleFactory().getShape();
        shapeOne.draw();

        // Get an object of Rectangle and call its draw method.
        Shape shapeTwo = new RectangleFactory().getShape();
        shapeTwo.draw();

        // Get an object of Square and call its draw method.
        Shape shapeThree = new SquareFactory().getShape();
        shapeThree.draw();
    }
}
