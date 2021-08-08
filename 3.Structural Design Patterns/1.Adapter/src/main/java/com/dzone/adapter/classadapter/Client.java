package com.dzone.adapter.classadapter;

/*
PROJECT NAME : design-patterns-java
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/4/2021 1:43 AM
*/


import com.dzone.Circle;
import com.dzone.Drawing;
import com.dzone.Rectangle;
import com.tools.ConsoleColors;

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
        System.out.println(ConsoleColors.ANSI_RESET + "--------------- Class Adapter Main ---------------");

        drawing.addShape(new TriangleAdapter());
        drawing.addShape(new RhombusAdapter());

        System.out.println("Drawing ...");
        drawing.draw();
        System.out.println("Resizing ...");
        drawing.resize();
    }
}
