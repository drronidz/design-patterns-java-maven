package com.course;

/*
PROJECT NAME : design-patterns-java
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 7/24/2021 12:42 AM
*/

import com.tools.ConsoleColors;
import com.course.color.Color;
import com.course.factory.AbstractFactory;
import com.course.factory.FactoryProducer;
import com.course.shape.Shape;

public class Client {
    public static void main(String[] args) {
        System.out.println(ConsoleColors.ANSI_WHITE + "-------------------------------Shape Factory--------------------------------------");

        // Get Shape Factory
        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");

        // Get an object of Shape Circle
        Shape circle = shapeFactory.getShape("CIRCLE");

        // Call draw method of Shape Circle
        circle.draw();

        // Get an object of Shape rectangle
        Shape rectangle = shapeFactory.getShape("RECTANGLE");

        // Call draw method of Shape Rectangle
        rectangle.draw();

        // Get an object of Shape rectangle
        Shape square = shapeFactory.getShape("SQUARE");

        // Call draw method of Shape Rectangle
        square.draw();

        System.out.println(ConsoleColors.ANSI_WHITE + "-------------------------------Color Factory--------------------------------------");

        // Get Shape Factory
        AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");

        // Get an object of Shape Circle
        Color red = colorFactory.getColor("RED");

        // Call draw method of Shape Circle
        red.fill();

        // Get an object of Shape rectangle
        Color yellow = colorFactory.getColor("YELLOW");

        // Call draw method of Shape Rectangle
        yellow.fill();

        // Get an object of Shape rectangle
        Color purple = colorFactory.getColor("PURPLE");

        // Call draw method of Shape Rectangle
        purple.fill();

    }
}
