package com.course.factory;

/*
PROJECT NAME : design-patterns-java
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 7/24/2021 1:23 AM
*/



public class FactoryProducer {
    public static AbstractFactory getFactory(String choice) {
        return switch (choice) {
            case "SHAPE" -> new ShapeFactory();
            case "COLOR" -> new ColorFactory();
            default -> null;
        };
    }
}
