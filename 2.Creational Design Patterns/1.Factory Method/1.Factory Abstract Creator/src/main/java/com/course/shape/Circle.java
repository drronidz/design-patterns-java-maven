package com.course.shape;

/*
PROJECT NAME : design-patterns-java
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 7/21/2021 5:08 PM
*/

import com.tools.ConsoleColors;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println(ConsoleColors.ANSI_ORANGE + "Inside Circle::draw() method.");
    }
}
