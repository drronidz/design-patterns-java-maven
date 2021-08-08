package com.course.shape;

/*
PROJECT NAME : design-patterns-java
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 7/30/2021 3:18 PM
*/

import com.tools.ConsoleColors;

public class Circle extends Shape {
    public Circle() {
        type = ConsoleColors.ANSI_PURPLE + "Circle";
    }
    @Override
    public void draw() {
        System.out.println(ConsoleColors.ANSI_PURPLE + "Inside Circle::draw() method.");
    }
}
