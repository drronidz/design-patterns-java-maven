package com.course.shape;

/*
PROJECT NAME : design-patterns-java
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 7/21/2021 5:06 PM
*/

import com.tools.ConsoleColors;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println(ConsoleColors.ANSI_GREEN + "Inside Rectangle::draw() method.");
    }
}
