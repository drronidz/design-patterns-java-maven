package com.course.shape;

/*
PROJECT NAME : design-patterns-java
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 7/22/2021 8:09 PM
*/

import com.tools.ConsoleColors;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println(ConsoleColors.ANSI_YELLOW + "Inside Square::draw() method.");
    }
}
