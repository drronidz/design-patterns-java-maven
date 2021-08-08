package com.dzone.adapter.twowaysadapter;

/*
PROJECT NAME : design-patterns-java
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/4/2021 1:43 AM
*/


import com.dzone.Drawing;
import com.dzone.ShapeType;

public class Client {
    public static void main(String[] args) {

        System.out.println("Creating drawing of shapes...");

        Drawing drawing = new Drawing();

        drawing.addShape(new TwoWaysAdapter(ShapeType.RECTANGLE));
        drawing.addShape(new TwoWaysAdapter(ShapeType.CIRCLE));
        drawing.addShape(new TwoWaysAdapter(ShapeType.TRIANGLE));
        drawing.addShape(new TwoWaysAdapter(ShapeType.RHOMBUS));

        System.out.println("Drawing ...");
        drawing.draw();

        System.out.println("Resizing ...");
        drawing.resize();
    }
}
