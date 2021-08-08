package com.course.factory;

/*
PROJECT NAME : design-patterns-java
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 7/24/2021 1:19 AM
*/

import com.course.color.Color;
import com.course.shape.Circle;
import com.course.shape.Rectangle;
import com.course.shape.Shape;
import com.course.shape.Square;

public class ShapeFactory extends AbstractFactory {
    @Override
    public Color getColor(String color) {
        return null;
    }

    @Override
    public Shape getShape(String shape) {
        return switch (shape) {
            case "CIRCLE" -> new Circle();
            case "SQUARE" -> new Square();
            case "RECTANGLE" -> new Rectangle();
            default -> null;
        };
    }
}
