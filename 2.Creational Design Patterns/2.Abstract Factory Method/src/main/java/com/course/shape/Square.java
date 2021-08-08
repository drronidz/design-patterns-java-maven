package com.course.shape;

/*
PROJECT NAME : design-patterns-java
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 7/24/2021 1:13 AM
*/

import com.tools.ConsoleColors;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println(ConsoleColors.ANSI_CYAN + "Inside Square::draw() method.");
    }
}
