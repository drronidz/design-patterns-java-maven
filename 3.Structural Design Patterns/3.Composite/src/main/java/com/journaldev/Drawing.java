package com.journaldev;

/*
PROJECT NAME : design-patterns-java
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/6/2021 12:22 AM
*/

import java.util.ArrayList;
import java.util.List;

public class Drawing implements Shape {

    // Collection of Shapes
    private List<Shape> shapes = new ArrayList<>();


    @Override
    public void draw(String fillColor) {
        for (Shape shape: shapes) {
            shape.draw(fillColor);
        }
    }

    // Adding shape to drawing
    public void add(Shape shape) {
        this.shapes.add(shape);
    }

    // Removing shape from drawing
    public void remove(Shape shape) {
        this.remove(shape);
    }

    // Removing all the shapes
    public void clear() {
        System.out.println("Clearing all the shapes from the drawing");
        this.shapes.clear();
    }
}
