package com.journaldev;

/*
PROJECT NAME : design-patterns-java
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/6/2021 12:25 AM
*/

public class Client {
    public static void main(String[] args) {
        Shape triangleOne = new Triangle();
        Shape triangleTwo = new Triangle();
        Shape circle = new Circle();

        Drawing drawing = new Drawing();
        drawing.add(triangleOne);
        drawing.add(triangleTwo);
        drawing.add(circle);

        drawing.draw("Red");

        drawing.clear();

        drawing.add(triangleOne);
        drawing.add(circle);
        drawing.draw("Green");
    }
}
