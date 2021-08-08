package com.challenge;/*
PROJECT NAME : design-patterns-java
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/4/2021 4:43 PM
*/

public class Client {
    public static void main(String[] args) {
        System.out.println(" ------------ Bridge Pattern (Challenge) ------------ ");

        // Coloring Green to Triangle
        System.out.println("\nColoring Triangle: ");
        Color green = new Green();
        Shape triangle = new Triangle(green);
        triangle.drawShape(20);
        triangle.modifyBorder(20, 3);

        // Coloring Red to Rectangle
        System.out.println("\nColoring Rectangle: ");
        Color red = new Red();
        Shape rectangle = new Rectangle(red);
        rectangle.drawShape(50);
        rectangle.modifyBorder(50, 2);

    }
}
