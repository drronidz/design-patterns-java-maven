package com.course.shape;

/*
PROJECT NAME : design-patterns-java
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 7/30/2021 3:16 PM
*/

import com.tools.ConsoleColors;

public class Rectanlge extends Shape {
    public Rectanlge() {
        type = ConsoleColors.ANSI_CYAN + "Rectangle";
    }

    @Override
    public void draw() {
        System.out.println(ConsoleColors.ANSI_CYAN + "Inside Rectangle::draw() method.");
    }
}
