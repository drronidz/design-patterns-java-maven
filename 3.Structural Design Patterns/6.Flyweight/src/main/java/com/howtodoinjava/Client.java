package com.howtodoinjava;

/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/10/2021 2:56 AM
*/

public class Client {
    public static void main(String[] args) {

        Pen yellowThinPenOne = PenFactory.createPen("YELLOW", BrushSize.THIN); // Created new Pen
        yellowThinPenOne.draw("Hello World !");

        Pen yellowThinPenTwo = PenFactory.createPen("YELLOW", BrushSize.THIN); // Pen is shared
        yellowThinPenTwo.draw("Hello World !");

        Pen blueThickPen = PenFactory.createPen("BLUE", BrushSize.THICK); // Created new Pen
        blueThickPen.draw("Hello World !");

        System.out.println("--------------------------------------------------------\n");

        System.out.println(yellowThinPenOne.hashCode());
        System.out.println(yellowThinPenTwo.hashCode());
        System.out.println(blueThickPen.hashCode());

    }
}
