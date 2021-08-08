package com.dzone.adapter.twowaysadapter;

/*
PROJECT NAME : design-patterns-java
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/4/2021 1:29 AM
*/

import com.dzone.*;
import com.tools.ConsoleColors;

public class TwoWaysAdapter implements Shape, GeometricShape {

    // Sides
    private ShapeType shapeType;

    public TwoWaysAdapter() {
        this(ShapeType.TRIANGLE);
    }

    public TwoWaysAdapter(ShapeType shapeType) {
        super();
        this.shapeType = shapeType;
    }

    @Override
    public double area() {
        switch (shapeType) {
            case CIRCLE, RECTANGLE -> { return 0.0d;}
            case TRIANGLE -> new Triangle().area();
            case RHOMBUS -> new Rhombus().area();
        }
        return 0.0d;
    }

    @Override
    public double perimeter() {
        switch (shapeType) {
            case CIRCLE, RECTANGLE -> { return 0.0d;}
            case TRIANGLE -> new Triangle().perimeter();
            case RHOMBUS -> new Rhombus().perimeter();
        }
        return 0.0d;
    }

    @Override
    public void drawShape() {
        draw();
    }

    @Override
    public void draw() {
        switch (shapeType) {
            case CIRCLE -> new Circle().draw();
            case RECTANGLE -> new Rectangle().draw();
            case TRIANGLE -> new Triangle().drawShape();
            case RHOMBUS -> new Rhombus().drawShape();
        }
    }

    @Override
    public void resize() {
        switch (shapeType) {
            case CIRCLE -> new Circle().resize();
            case RECTANGLE -> new Rectangle().resize();
            case TRIANGLE -> System.out.println(ConsoleColors.ANSI_RESET + "Triangle can't be resized. Please create new one with required values.");
            case RHOMBUS -> System.out.println(ConsoleColors.ANSI_RESET + "Rhombus can't be resized. Please create new one with required values.");
        }
    }

    @Override
    public String description() {
        switch (shapeType) {
            case CIRCLE -> new Circle().description();
            case RECTANGLE -> new Rectangle().description();
            case TRIANGLE -> {
                return "Triangle object";
            }
            case RHOMBUS -> {
                return "Rhombus object";
            }
        }
        return "Unknown object";
    }

    @Override
    public boolean isHide() {
        return false;
    }
}
