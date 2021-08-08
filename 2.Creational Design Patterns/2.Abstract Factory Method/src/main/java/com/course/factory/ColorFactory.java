package com.course.factory;

/*
PROJECT NAME : design-patterns-java
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 7/24/2021 1:22 AM
*/

import com.course.color.Color;
import com.course.color.Purple;
import com.course.color.Red;
import com.course.color.Yellow;
import com.course.shape.Shape;

public class ColorFactory extends AbstractFactory {
    @Override
    public Color getColor(String color) {
        return switch (color) {
            case "RED" -> new Red();
            case "PURPLE" -> new Purple();
            case "YELLOW" -> new Yellow();
            default -> null;
        };
    }

    @Override
    public Shape getShape(String shape) {
        return null;
    }
}
