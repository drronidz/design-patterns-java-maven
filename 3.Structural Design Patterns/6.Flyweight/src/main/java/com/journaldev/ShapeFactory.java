package com.journaldev;

/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/10/2021 3:20 PM
*/

import java.util.HashMap;

public class ShapeFactory {

    private static final HashMap <ShapeType, Shape> shapeCache = new HashMap<>();

    public static Shape makeShape(ShapeType type) {
        Shape shape = null;

        if(shapeCache.containsKey(type)) {
            shape = shapeCache.get(type);
        } else {
            switch (type) {
                case LINE -> shape = new Line();
                case OVAL_FILL -> shape = new Oval(true);
                case OVAL_NOFILL -> shape = new Oval(false);
            }
            shapeCache.put(type, shape);
        }
        return shape;
    }
}
