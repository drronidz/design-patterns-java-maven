package com.course.Shape;

/*
PROJECT NAME : design-patterns-java
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 7/23/2021 1:29 AM
*/

import com.tools.ConsoleColors;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println(ConsoleColors.ANSI_GREEN + "Inside Circle::draw() method.");
    }
}
