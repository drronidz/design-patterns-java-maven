package com.course.factory;

/*
PROJECT NAME : design-patterns-java
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 7/23/2021 1:30 AM
*/

import com.course.Shape.Circle;
import com.course.Shape.Rectangle;
import com.course.Shape.Shape;
import com.course.Shape.Square;

public class ShapeFactory {
    // Use getShape method to get object of type shape
    public static Shape getShape(String shapeType) {
        return switch (shapeType) {
            case "CIRCLE" -> new Circle();
            case "RECTANGLE" -> new Rectangle();
            case "SQUARE" -> new Square();
            default -> null;
        };
    }
}
