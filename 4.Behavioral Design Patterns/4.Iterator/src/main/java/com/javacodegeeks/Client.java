package com.javacodegeeks;

/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/17/2021 5:37 PM
*/

public class Client {
    public static void main(String[] args) {
        ShapeStorage shapeStorage = new ShapeStorage();
        shapeStorage.addShape("Polygon");
        shapeStorage.addShape("Hexagon");
        shapeStorage.addShape("Circle");
        shapeStorage.addShape("Rectangle");
        shapeStorage.addShape("Square");

        ShapeIterator iterator = new ShapeIterator(shapeStorage.getShapes());
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("Apply removing while iterating...");
        iterator = new ShapeIterator(shapeStorage.getShapes());
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
            iterator.remove();
        }
    }
}
