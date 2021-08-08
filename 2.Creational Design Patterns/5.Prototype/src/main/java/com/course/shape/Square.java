package com.course.shape;

/*
PROJECT NAME : design-patterns-java
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 7/30/2021 3:19 PM
*/

import com.tools.ConsoleColors;

public class Square extends Shape {

    public Square() {
        type = ConsoleColors.ANSI_GREEN +  "Square";
    }

    @Override
    public void draw() {
        System.out.println(ConsoleColors.ANSI_GREEN + "Inside Square::draw() method.");
    }
}
