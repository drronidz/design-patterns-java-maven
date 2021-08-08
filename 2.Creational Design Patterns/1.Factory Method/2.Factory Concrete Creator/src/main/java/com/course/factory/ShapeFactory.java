package com.course.factory;

/*
PROJECT NAME : design-patterns-java
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 7/22/2021 8:08 PM
*/

import com.course.shape.Circle;
import com.course.shape.Rectangle;
import com.course.shape.Shape;
import com.course.shape.Square;

public class ShapeFactory {
    // Use getShape method to get object of type shape.
    public Shape getShape(String shapeType) {
        return switch (shapeType) {
            case "CIRCLE" -> new Circle();
            case "RECTANGLE" -> new Rectangle();
            case "SQUARE" -> new Square();
            default -> null;
        };
    }
}
