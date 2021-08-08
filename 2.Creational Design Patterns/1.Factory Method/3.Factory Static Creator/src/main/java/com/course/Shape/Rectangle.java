package com.course.Shape;

/*
PROJECT NAME : design-patterns-java
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 7/23/2021 1:27 AM
*/

import com.tools.ConsoleColors;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println(ConsoleColors.ANSI_PURPLE + "Inside Rectangle::draw() method.");
    }
}
