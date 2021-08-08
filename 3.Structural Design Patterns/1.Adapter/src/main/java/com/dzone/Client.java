package com.dzone;

/*
PROJECT NAME : design-patterns-java
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/4/2021 12:27 AM
*/

import com.dzone.adapter.object.GeometricShapeObjectAdapter;
import com.tools.*;


public class Client {
    public static void main(String[] args) {

        System.out.println("Creating drawing of shapes ...");
        Drawing drawing = new Drawing();
        drawing.addShape(new Rectangle());
        drawing.addShape(new Circle());

        System.out.println(ConsoleColors.ANSI_RESET + "Drawing...");
        drawing.draw();

        System.out.println(ConsoleColors.ANSI_RESET + "Resizing...");
        drawing.resize();

        System.out.println(ConsoleColors.ANSI_RESET + "--------------- Object Adapter Main ---------------");

        drawing.addShape(new GeometricShapeObjectAdapter(new Triangle()));
        drawing.addShape(new GeometricShapeObjectAdapter(new Rhombus()));

        System.out.println(ConsoleColors.ANSI_RESET + "Drawing ...");
        drawing.draw();
        System.out.println(ConsoleColors.ANSI_RESET + "Resizing ...");
        drawing.resize();




        System.out.println(ConsoleColors.ANSI_RESET + "--------------- Class Adapter Main ---------------");


    }
}
