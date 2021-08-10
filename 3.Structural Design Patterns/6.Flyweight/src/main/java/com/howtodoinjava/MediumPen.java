package com.howtodoinjava;

/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/10/2021 2:43 AM
*/

public class MediumPen implements Pen {

    final BrushSize brushSize = BrushSize.MEDIUM;  // intrinsic state - shareable

    private String color = null;  // extrinsic state - supplied by client

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void draw(String content) {
        System.out.println("Drawing MEDIUM content in color : " + color);
    }
}
