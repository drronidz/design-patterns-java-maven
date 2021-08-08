package com.course;

/*
PROJECT NAME : design-patterns-java
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 7/30/2021 3:09 PM
*/


import com.course.shape.Shape;
import com.course.shape.ShapeCache;
import com.tools.ConsoleColors;

public class Client {
    public static void main(String[] args) {
        String shape = ConsoleColors.ANSI_YELLOW +  "Shape";
        ShapeCache.loadCache();

        Shape clonedShapeOne = ShapeCache.getShape("1");
        System.out.println(shape + " " + clonedShapeOne.getType());

        Shape clonedShapeTwo = ShapeCache.getShape("2");
        System.out.println(shape + " " + clonedShapeTwo.getType());

        Shape clonedShapeThree = ShapeCache.getShape("3");
        System.out.println(shape + " " + clonedShapeThree.getType());


    }
}
